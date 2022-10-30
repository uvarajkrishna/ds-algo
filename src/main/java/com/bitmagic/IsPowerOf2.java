package com.bitmagic;

import static org.assertj.core.api.Assertions.assertThat;

public class IsPowerOf2 {

  public static void main(String[] args) {
    assertThat(isPowOf2(2)).isTrue();
    assertThat(isPowOf2(4)).isTrue();
    assertThat(isPowOf2(6)).isFalse();
  }

  private static boolean isPowOf2(final int number) {
    //Brian Kerningam method
    return (number & (number - 1)) == 0;
  }
}
