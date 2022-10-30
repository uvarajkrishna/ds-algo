package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Factorial {

  public static void main(String[] args) {
    assertThat(factorialThroughIteration(4)).isEqualTo(24);
    assertThat(factorialThroughIteration(6)).isEqualTo(720);
    assertThat(factorialThroughIteration(0)).isEqualTo(1);

    assertThat(factorialThroughRecursion(4)).isEqualTo(24);
    assertThat(factorialThroughRecursion(6)).isEqualTo(720);
    assertThat(factorialThroughRecursion(0)).isEqualTo(1);
    assertThat(factorialThroughRecursion(1)).isEqualTo(1);
    assertThat(factorialThroughRecursion(10)).isEqualTo(3628800);
  }

  private static int factorialThroughIteration(final int number) {
    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }

  private static int factorialThroughRecursion(int number) {
    if (number == 0) {
      return 1;
    }
    return number * factorialThroughRecursion(number - 1);
  }
}
