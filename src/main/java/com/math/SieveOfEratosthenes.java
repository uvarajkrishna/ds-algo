package com.math;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

@SuppressWarnings({"java:S5960", "java:S106"})
public class SieveOfEratosthenes {

  public static void main(String[] args) {
    assertThat(getPrimes(50)).isEqualToIgnoringCase("2,3,5,7,11,13,17,19,23,29,31,37,41,43,47");
  }

  private static String getPrimes(final int number) {
    boolean[] isPrime = new boolean[number + 1];
    Arrays.fill(isPrime, true);

    for (int i = 2; i * i <= number; i++) {
      if (isPrime[i]) {
        for (int j = 2 * i; j <= number; j = j + i) {
          if (j % i == 0) {
            isPrime[j] = false;
          }
        }
      }
    }
    StringBuilder builder = new StringBuilder();
    for (int i = 2; i < isPrime.length; i++) {
      if (isPrime[i]) {
        System.out.print(i + " ");
        builder.append(i).append(",");
      }
    }
    String primes = builder.toString();
    return primes.substring(0, primes.length() - 1);
  }


}
