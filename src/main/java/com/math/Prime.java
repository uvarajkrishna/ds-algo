package com.math;

import static org.assertj.core.api.Assertions.assertThat;

public class Prime {

  public static void main(String[] args) {
    assertThat(isPrime_naive(13)).isTrue();
    assertThat(isPrime_naive(139)).isTrue();
    assertThat(isPrime_naive(138)).isFalse();

    assertThat(isPrime_efficient(13)).isTrue();
    assertThat(isPrime_efficient(139)).isTrue();
    assertThat(isPrime_efficient(138)).isFalse();
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
}
