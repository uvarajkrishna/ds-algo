package com.math;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Factorial {

  public static void main(String[] args) {
    assert factorialIterative(4) == 24;
    assert factorialIterative(6) == 720;
    assert factorialIterative(0) == 0;

    assert factorialRecursive(4) == 24;
    assert factorialRecursive(6) == 720;
    assert factorialRecursive(0) == 1;
    assert factorialRecursive(1) == 1;
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
