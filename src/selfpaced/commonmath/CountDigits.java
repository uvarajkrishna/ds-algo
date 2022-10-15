package selfpaced.commonmath;

import org.junit.Assert;

@SuppressWarnings({"java:S5960", "java:S106"})
public class CountDigits {

  public static void main(String[] args) {
    Assert.assertEquals(5, countDigits(12345));
    Assert.assertEquals(1, countDigits(1));
    Assert.assertEquals(3, countDigits(-100));
  }

  private static int countDigits(int number) {
    int count = 0;
    while (number != 0) {
      number = number / 10;
      count++;
    }
    return count;
  }
}
