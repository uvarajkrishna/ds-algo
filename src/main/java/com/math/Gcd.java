package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Gcd {

  public static void main(String[] args) {
    assertThat(gcd_naive(4, 6)).isEqualTo(2);
    assertThat(gcd_naive(100, 200)).isEqualTo(100);
    assertThat(gcd_naive(7, 13)).isEqualTo(1);

    assertThat(gcd_euclids(4, 6)).isEqualTo(2);
    assertThat(gcd_euclids(100, 200)).isEqualTo(100);
    assertThat(gcd_euclids(7, 13)).isEqualTo(1);

    assertThat(gcd_euclids_improved(4, 6)).isEqualTo(2);
    assertThat(gcd_euclids_improved(100, 200)).isEqualTo(100);
    assertThat(gcd_euclids_improved(7, 13)).isEqualTo(1);
  }

  private static int gcd_naive(int a, int b) {
    int min = Math.min(a, b);
    int factor = 1;
    for (int i = min; i >= 1; i--) {
      if (a % i == 0 & b % i == 0) {
        factor = i;
        break;
      }
    }
    return factor;
  }


  private static int gcd_euclids(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  public static int gcd_euclids_improved(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd_euclids_improved(b, a % b);
  }
}
