package selfpaced.commonmath;

import static org.junit.Assert.assertEquals;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Factorial {

  public static void main(String[] args) {
    assertEquals(24, factorialIterative(4));
    assertEquals(720, factorialIterative(6));
    assertEquals(1, factorialIterative(0));

    assertEquals(24, factorialRecursive(4));
    assertEquals(720, factorialRecursive(6));
    assertEquals(1, factorialRecursive(0));
    assertEquals(1, factorialRecursive(1));
  }

  private static int factorialIterative(final int number) {
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }

  private static int factorialRecursive(int number) {
    if (number == 0) {
      return 1;
    }
    return number * factorialRecursive(number - 1);
  }
}
