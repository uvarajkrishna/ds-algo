package com.math;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class PrimeFactors {

  public static void main(String[] args) {
    assertThat(primeFactors_division(40)).isEqualToIgnoringCase("2 2 2 5");
    assertThat(primeFactors_division(139)).isEqualToIgnoringCase("139");
    assertThat(primeFactors_division(450)).isEqualToIgnoringCase("2 3 3 5 5");

    assertThat(primeFactors_division_efficient(40)).isEqualToIgnoringCase("2 2 2 5");
    assertThat(primeFactors_division_efficient(139)).isEqualToIgnoringCase("139");
    assertThat(primeFactors_division_efficient(450)).isEqualToIgnoringCase("2 3 3 5 5");
  }

  public static String primeFactors_division(int n) {
    System.out.print(n + " - ");
    StringBuilder builder = new StringBuilder();
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        builder.append(i).append(" ");
        n = n / i;
      }
    }
    if (n > 2) {
      builder.append(n);
    }
    String factors = builder.toString().trim();
    System.out.println(factors);
    return factors;
  }

  public static String primeFactors_division_efficient(int n) {
    System.out.print(n + " - ");
    StringBuilder builder = new StringBuilder();

    while (n % 2 == 0) {
      builder.append(2).append(" ");
      n = n / 2;
    }

    while (n % 3 == 0) {
      builder.append(3).append(" ");
      n = n / 3;
    }

    for (int i = 5; i * i <= n; i = i + 6) {
      while (n % i == 0) {
        builder.append(i).append(" ");
        n = n / i;
      }
      int iP2 = i + 2;
      while (n % iP2 == 0) {
        builder.append(iP2).append(" ");
        n = n / iP2;
      }
    }
    if (n > 2) {
      builder.append(n);
    }
    String factors = builder.toString().trim();
    System.out.println(factors);
    return factors;
  }
}
