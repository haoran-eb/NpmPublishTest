package wanglei_work;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTwo {

  public static void main(final String[] args) {
    final String date = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));

    String value = "";
    final Pattern pattern = Pattern.compile(".*?([[国|苏]药准字].*?[^\\s]*)");
    final Matcher matcher = pattern.matcher("1234425 国药准字H53020867 苏药准字H53020867 86900xXXX");
    while (matcher.find()) {
      value = matcher.group(1);
    }
    System.out.println(value);
  }
}
