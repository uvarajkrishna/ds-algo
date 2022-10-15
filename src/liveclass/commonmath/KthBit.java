package liveclass.commonmath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthBit {

  public static void main(String[] args) {
    assert kthBit(8, 0);
  }

  private static boolean kthBit(int number, int k) {
    List<Integer> binary = new ArrayList<>();
    while (number > 0) {
      binary.add(number % 2);
      number = number / 2;
    }
    System.out.println(binary);
    Collections.reverse(binary);
    return binary.get(k) == 1;
  }
}
