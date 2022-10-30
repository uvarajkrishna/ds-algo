package com.bitmagic;

import static org.assertj.core.api.Assertions.assertThat;
@SuppressWarnings({"java:S5960", "java:S106"})
public class OddOccuringSingleNumber {

  public static void main(String[] args) {
    int[] arr = {4, 3, 4, 4, 4, 5, 5};
    assertThat(oddOccurringNaive(arr)).isEqualTo(3);
    assertThat(oddOccurring_Xor(arr)).isEqualTo(3);
  }

  private static int oddOccurring_Xor(final int[] arr) {
    int oddNumber = 0;
    for (int i = 0; i < arr.length; i++) {
      oddNumber = oddNumber ^ arr[i];
    }
    return oddNumber;
  }

  private static int oddOccurringNaive(final int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count % 2 != 0) {
        return arr[i];
      }
    }
    return -1;
  }
}
