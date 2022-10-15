package selfpaced.commonmath;

import static org.junit.Assert.assertEquals;

@SuppressWarnings({"java:S5960", "java:S106"})
public class FactorialTrailingZero {

  public static void main(String[] args) {
    assertEquals(1, loopMethod(5));
    assertEquals(2, loopMethod(10));

    assertEquals(1, seriesMethod(5));
    assertEquals(2, seriesMethod(10));
    assertEquals(24, seriesMethod(100));
  }

  // count = n/5 + n/25 + ... until n
  private static int seriesMethod(final int number) {
    int count = 0;
    for (int i = 5; i <= number; i *= 5) {
      count = count + number / i;
    }
    System.out.println(number + " - " + "...." + " - " + count);
    return count;
  }

  private static int loopMethod(final int number) {
    long factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }
    long tempFact = factorial;
    int trailingZeros = 0;
    while (factorial % 10 == 0) {
      trailingZeros++;
      factorial = factorial / 10;
    }
    System.out.println(number + " - " + tempFact + " - " + trailingZeros);
    return trailingZeros;
  }


}
