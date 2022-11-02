package com.math;

import java.util.Arrays;

@SuppressWarnings({"java:S5960", "java:S106"})
public class SieveOfEratosthenes {

  public static void main(String[] args) {
    int number = 105;
    boolean[] isPrime = new boolean[number + 1];
    Arrays.fill(isPrime, true);

    for (int i = 2; i * i <= number; i++) {
      if (isPrime[i]) {
        for (int j = 2 * i; j <= number; j = j + i) {
            if(j%i==0){
              isPrime[j]= false;
            }
        }
      }
    }
    for (int i = 2; i < isPrime.length; i++) {
      if(isPrime[i]){
        System.out.print(i+ " ");
      }
    }
  }

}
