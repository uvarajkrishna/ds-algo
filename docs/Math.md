# Problems on common maths

## Counting Digits

**Problem -** Count the number of digits in a given number.

|  Input |  Output |
|-------:|--------:|
|  12345 |       5 |
|    111 |       3 |

**Tips -** Divide Number by 10 until it is equal to zero. Number of times divided will lead to
number of digits.

[CountDigits.java](../src/main/java/com/math/CountDigits.java)

```java
  private static int countOfDigitsIn(int number) {
    int count = 0;
    while (number != 0) {
      number = number / 10;
      count++;
    }
    return count;
  }
```

## Palindrome Numbers

**Problem -** Check whether the given number is palindrome.

| Input |  Output |
|------:|--------:|
| 12345 |   False |
|   111 |    True |
|  1221 |    True |

**Tips -** Use divide by 10 approach. But this time use temp variable to store right most number 
sliced using modulo of ten.

[Palindrome.java](../src/main/java/com/math/Palindrome.java)
```java
  public static boolean isPalindrome(int number) {
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
    return originalNumber == reversedNumber;
  }
```
## Factorial of a Number

## Trailing Zeros in Factorial

## GCD or HCF of Two Numbers

## LCM of Two Numbers

## Check for Prime

## Prime Factors

## All Divisors of a Number

## Sieve of Eratosthenes

## Computing Power

## Iterative Power