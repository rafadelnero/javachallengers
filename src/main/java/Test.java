public class Test {

  public static void main(String[] args) {
    writeTriangle(5);
  }

  static void writeTriangle(int triangleLines) {
    for (int i = 1; i <= triangleLines; i++) {
      for (int spaceIndex = 1; spaceIndex <= triangleLines - i; spaceIndex++) {
        System.out.print(" ");
      }
      for (int starIndex = triangleLines - i; starIndex <= triangleLines; starIndex++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
