package com.math;

import static com.math.Gcd.gcd_euclids_improved;
import static org.assertj.core.api.Assertions.assertThat;

public class Lcm {

  public static void main(String[] args) {
    assertThat(lcm_naive(4, 6)).isEqualTo(12);
    assertThat(lcm_naive(100, 200)).isEqualTo(200);
    assertThat(lcm_naive(2, 5)).isEqualTo(10);

    assertThat(lcm_formula(4, 6)).isEqualTo(12);
    assertThat(lcm_formula(100, 200)).isEqualTo(200);
    assertThat(lcm_formula(2, 5)).isEqualTo(10);
  }

  private static int lcm_naive(int a, int b) {
    int lcm = a * b;
    for (int i = Math.max(a, b); i <= lcm; i++) {
      if (i % a == 0 && i % b == 0) {
        lcm = i;
        break;
      }
    }
    return lcm;
  }

  private static int lcm_formula(int a, int b) {
    return a * b / gcd_euclids_improved(a, b);
  }
}
