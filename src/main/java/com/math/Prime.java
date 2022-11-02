package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Prime {

  public static void main(String[] args) {
    assertThat(isPrime_naive(13)).isTrue();
    assertThat(isPrime_naive(139)).isTrue();
    assertThat(isPrime_naive(138)).isFalse();

    assertThat(isPrime_efficient(13)).isTrue();
    assertThat(isPrime_efficient(139)).isTrue();
    assertThat(isPrime_efficient(138)).isFalse();

    assertThat(isPrime_ultraEfficient(13)).isTrue();
    assertThat(isPrime_ultraEfficient(139)).isTrue();
    assertThat(isPrime_ultraEfficient(138)).isFalse();
  }

  private static boolean isPrime_naive(final int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPrime_efficient(final int n) {
    for (int i = 2; i * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPrime_ultraEfficient(final int n) {

    if (n <= 1) {
      return false;
    }

    // Check if n=2 or n=3
    if (n == 2 || n == 3) {
      return true;
    }

    // Check whether n is divisible by 2 or 3
    if (n % 2 == 0 || n % 3 == 0) {
      return false;
    }

    // Check from 5 to square root of n
    // Iterate i by (i+6)
    for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false;
      }
    }

    return true;
  }
}
