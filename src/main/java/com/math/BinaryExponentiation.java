package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106", "java:S100"})
public class BinaryExponentiation {

  public static void main(String[] args) {
    assertThat(power_binaryExpo(2, 2)).isEqualTo(4);
    assertThat(power_binaryExpo(2, 3)).isEqualTo(8);

    assertThat(power_binaryExpo_bitmagic(2, 2)).isEqualTo(4);
    assertThat(power_binaryExpo_bitmagic(2, 3)).isEqualTo(8);
  }

  private static int power_binaryExpo(int x, int n) {
    int tempN = n;
    int power = 1;
    while (n > 0) {
      if (n % 2 != 0) {
        power = power * x;
      }
      x = x * x;
      n = n / 2;
    }
    System.out.println(x + "^" + tempN + "=" + power);
    return power;
  }

  private static int power_binaryExpo_bitmagic(int x, int n) {
    int tempN = n;
    int power = 1;
    while (n > 0) {
      if ((n & 1) == 1) {
        power = power * x;
      }
      x = x * x;
      n = n >> 1;
    }
    System.out.println(x + "^" + tempN + "=" + power);
    return power;
  }
}
