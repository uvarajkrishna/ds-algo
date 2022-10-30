package com.bitmagic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.Consumer;
import org.assertj.core.api.Assertions;
import org.assertj.core.description.Description;

public class SetBits {

  public static void main(String[] args) {
    Consumer<Description> descriptionConsumer = desc -> System.err.println(String.format(
        "Asserting"
            + " - %s", desc));
    Assertions.setDescriptionConsumer(descriptionConsumer);

    assertThat(setBits_naive_digitalConversion(5)).as("Number of set bits").isEqualTo(2);
    assertThat(setBits_naive_digitalConversion(7)).as("Number of set bits").isEqualTo(3);

    assertThat(setBits_naive_bitmagic(5)).as("Number of set bits").isEqualTo(2);
    assertThat(setBits_naive_bitmagic(7)).as("Number of set bits").isEqualTo(3);

    assertThat(setBits_optimized_brianKerningam(5)).as("Number of set bits").isEqualTo(2);
    assertThat(setBits_optimized_brianKerningam(7)).as("Number of set bits").isEqualTo(3);

  }

  private static int setBits_naive_digitalConversion(int number) {
    int count = 0;
    while (number > 0) {
      if (number % 2 == 1) {
        count++;
      }
      number = number / 2;
    }
    return count;
  }

  private static int setBits_naive_bitmagic(int number) {
    int count = 0;
    while (number > 0) {
      if ((number & 1) == 1)
        count++;
      //or count = count + (number & 1)
      number = number >> 1;
    }
    return count;
  }

  private static int setBits_optimized_brianKerningam(int number) {
    int count = 0;
    while (number > 0) {
      number = number & (number -1);
      count++;
    }
    return count;
  }
}
