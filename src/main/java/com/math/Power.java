package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Power {

  public static void main(String[] args) {
    assertThat(power_naive(2, 2)).isEqualTo(4);
    assertThat(power_naive(2, 3)).isEqualTo(8);
  }

  private static int power_naive(int x, int n) {
    int power = 1;
    for (int i = 0; i < n; i++) {
      power = power * x;
    }
    System.out.println(x + "^" + n + "=" + power);
    return power;
  }

  private static int power_evenOdd(int x, int n) {
    int power = 1;

    System.out.println(x + "^" + n + "=" + power);
    return power;
  }
}
