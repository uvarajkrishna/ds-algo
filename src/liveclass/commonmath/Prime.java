package liveclass.commonmath;

public class Prime {

  public static void main(String[] args) {
    assert checkPrime_OofN(6);
  }

  private static boolean checkPrime_OofN(int number) {
    boolean isPrime = true;
    for (int i = 2; i < number; i++) {
      if(number  % i == 0){
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }

  private static boolean checkPrime_OofNBy2(int number) {
    boolean isPrime = true;
    for (int i = 2; i < number/2; i++) {
      if(number  % i == 0){
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}