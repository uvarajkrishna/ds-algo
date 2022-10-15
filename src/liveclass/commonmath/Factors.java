package liveclass.commonmath;

public class Factors {

  public static void main(String[] args) {
    int n = 54;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i);
        if (i * i != n) {
          System.out.println(n / i);
        }
      }
    }
  }
}
