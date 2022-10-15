package liveclass.commonmath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryConversion {

  public static void main(String[] args) {
    String binaryOf22 = convertToBinary(22);
    assert binaryOf22.equalsIgnoreCase("10110");
    assert convertToBinary(38).equalsIgnoreCase("1100110");
  }

  static String convertToBinary(int number) {
    List<String> binary = new ArrayList<>();
    while (number > 0) {
      binary.add(Integer.toString(number % 2));
      number = number / 2;
    }
    Collections.reverse(binary);
    return String.join("", binary);
  }
}
