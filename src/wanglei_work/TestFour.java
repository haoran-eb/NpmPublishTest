package wanglei_work;

public class TestFour {

  public enum FileType {
    CSV("csv"),
    TSV("tsv");

    private final String type;

    FileType(final String type) {
      this.type = type;
    }

    public String type() {
      return type;
    }
  }

  public static void main(final String[] args) {
    System.out.println(FileType.CSV);
    System.out.println(FileType.CSV.type());
  }
}
