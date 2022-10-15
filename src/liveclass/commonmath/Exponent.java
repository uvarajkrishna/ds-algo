package liveclass.commonmath;

public class Exponent {

  public static void main(String[] args) {
    assert exponent(2, 3) == 8;
    assert exponent(2, 0) == 1;
  }

  private static int exponent(int x, int y) {
    int exponent = 1;
    for (int i = 0; i < y; i++) {
      exponent = exponent * x;
    }
    System.out.println(exponent);
    return exponent;
  }
}
