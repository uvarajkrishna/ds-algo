package com.bitmagic;

import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings({"java:S5960", "java:S106"})
public class KthBit {

  public static void main(String[] args) {
    assertThat(kthBitSet(5, 3)).isTrue();
    assertThat(kthBitSet(5, 2)).isFalse();

    assertThat(kthBitSet_alternate(5, 3)).isTrue();
    assertThat(kthBitSet_alternate(5, 2)).isFalse();

  }

  private static boolean kthBitSet(final int n, final int k) {
    return (n & (1 << (k - 1))) != 0;
  }
  private static boolean kthBitSet_alternate(final int n, final int k) {
    return ((n >> (k - 1)) & 1) != 0;
  }
}
