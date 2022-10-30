package com.math;


import static org.assertj.core.api.Assertions.assertThat;
@SuppressWarnings({"java:S5960", "java:S106"})
public class CountDigits {

  public static void main(String[] args) {
    assertThat(countOfDigitsIn(12345)).isEqualTo(5);
    assertThat(countOfDigitsIn(1)).isEqualTo(1);
  }

  private static int countOfDigitsIn(int number) {
    int count = 0;
    while (number != 0) {
      number = number / 10;
      count++;
    }
    return count;
  }

}
