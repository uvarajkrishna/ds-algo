package com.math;

@SuppressWarnings({"java:S5960", "java:S106"})
public class AllDivisors {

  public static void main(String[] args) {
    assert allDivisors_own(15).equals("1,3,5,15");
    assert allDivisors_own(25).equals("1,5,25");

    assert allDivisors_optimized(15).equals("1,3,5,15");
    assert allDivisors_optimized(25).equals("1,5,25");
  }

  //O(sqrt(n))
  private static String allDivisors_optimized(final int number) {
    int i;
    StringBuilder builder = new StringBuilder();
    for (i = 1; i * i < number; i++) {
      if (number % i == 0) {
        if (i == 1) {
          builder.append(i);
        } else {
          builder.append(",").append(i);
        }
      }
    }
    for (; i >= 1; i--) {
      if (number % i == 0) {
        builder.append(",").append(number / i);
      }
    }
    String divisors = builder.toString();
    System.out.println(divisors);
    return divisors;
  }


  //O(N/2)
  private static String allDivisors_own(final int number) {

    int outLength = number / 2;
    int[] outputArr = new int[outLength];

    int ascIdx = 0;
    int descIdx = outLength - 1;
    for (int i = 1; i * i <= number; i++) {
      if (number % i == 0) {
        outputArr[ascIdx] = i;
        ascIdx++;
        if (i != number / i) {
          outputArr[descIdx] = number / i;
          descIdx--;
        }
      }
    }

    String output = "";
    for (int i = 0; i < outputArr.length; i++) {
      if (i == 0) {
        output = output + outputArr[i];
      } else {
        if (outputArr[i] != 0) {
          output = output + "," + outputArr[i];
        }
      }
    }
    System.out.println(output);
    return output;
  }

}
