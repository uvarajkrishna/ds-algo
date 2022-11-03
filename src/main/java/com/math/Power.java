package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Power {

  public static void main(String[] args) {
    assertThat(power_naive(2, 2)).isEqualTo(4);
    assertThat(power_naive(2, 3)).isEqualTo(8);

    assertThat(power_recursive(2, 2)).isEqualTo(4);
    assertThat(power_recursive(2, 3)).isEqualTo(8);
  }

  private static int power_naive(int x, int n) {
    int power = 1;
    for (int i = 0; i < n; i++) {
      power = power * x;
    }
    System.out.println(x + "^" + n + "=" + power);
    return power;
  }

  private static int power_recursive(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int powerNby2 = power_recursive(x, n / 2);

    int power;
    if (n % 2 == 0) {
      power = powerNby2 * powerNby2;
    } else {
      power = x * powerNby2 * powerNby2;
    }
    System.out.println(x + "^" + n + "=" + power);
    return power;
  }
}
