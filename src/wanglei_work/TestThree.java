package wanglei_work;

import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;

public class TestThree {

  static final NumberFormat numberFormat = NumberFormat.getNumberInstance();

  public static void main(final String[] args) throws UnsupportedEncodingException {
    final double budget = 12.325d;
    final double budget2 = 2.5d;
    System.out.println(convertToInteger(budget));
    System.out.println(Math.round(budget2));
  }

  private static Integer convertToInteger(final double budget) {

    return (int) Math.round(budget * 100);
  }

  private static Integer convertToInteger2(final Float budget) {
    return (int) (Double.parseDouble(String.format("%.2f", (double) budget)) * 100);
  }

  private static String formatBudgetToTwoDecimalPlaces(final Integer budget) {
    return String.format("%.2f", (double) budget / 100);
  }

  private static void formatTestMove() {
    System.out.println(99 >> 4);
  }
}
