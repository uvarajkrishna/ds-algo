package selfpaced.commonmath;

@SuppressWarnings({"java:S5960", "java:S106"})
public class Palindrome {

  public static void main(String[] args) {
    palindrome(78987);
    palindrome(8668);
    palindrome(8);
    palindrome(21);
    palindrome(367);
  }

  static boolean palindrome(int number) {
    if (number < 0) {
      return false;
    }
    if (number < 10) {
      return true;
    }
    int reversedNumber = 0;
    int originalNumber = number;
    while (number > 0) {
      reversedNumber = reversedNumber * 10 + number % 10;
      number = number / 10;
    }
    System.out.print(originalNumber);
    System.out.print("-");
    System.out.print(reversedNumber);
    System.out.print("-");
    System.out.println(originalNumber == reversedNumber);
    return originalNumber == reversedNumber;
  }
}