package wanglei_work;

import java.util.concurrent.CountDownLatch;

public class Test {

  private static final CountDownLatch latch = new CountDownLatch(1);

  public static void main(final String[] args) {
    final Object lock = new Object();
    final char[] number = "1234567".toCharArray();
    final char[] letter = "ABCDEFG".toCharArray();

    new Thread(
            () -> {
              try {
                latch.await();
              } catch (final InterruptedException e) {
                e.printStackTrace();
              }
              synchronized (lock) {
                for (final char c : number) {
                  System.out.print(c);
                  try {
                    lock.notify();
                    lock.wait();
                  } catch (final InterruptedException e) {
                    e.printStackTrace();
                  }
                }
                lock.notify();
              }
            },
            "t1")
        .start();

    new Thread(
            () -> {
              synchronized (lock) {
                for (final char c : letter) {
                  System.out.print(c);
                  latch.countDown();
                  try {
                    lock.notify();
                    lock.wait();
                  } catch (final InterruptedException e) {
                    e.printStackTrace();
                  }
                }
                lock.notify();
              }
            },
            "t2")
        .start();
  }
}
