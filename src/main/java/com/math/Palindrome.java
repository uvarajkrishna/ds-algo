package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Palindrome {

  public static void main(String[] args) {
    assertThat(isPalindrome(78987)).isTrue();
    assertThat(isPalindrome(8668)).isTrue();
    assertThat(isPalindrome(8)).isTrue();
    assertThat(isPalindrome(21)).isFalse();
    assertThat(isPalindrome(367)).isFalse();
  }

  public static boolean isPalindrome(int number) {
    if (number < 0) {
      return false;
    }
    if (number < 10) {
      return true;
    }
    int reversedNumber = 0;
    int originalNumber = number;
    while (number > 0) {
      reversedNumber = reversedNumber * 10 + number % 10;
      number = number / 10;
    }
    return originalNumber == reversedNumber;
  }
}