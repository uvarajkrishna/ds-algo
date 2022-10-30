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
    int originalNumber=number;
    while(number>0){
    reversedNumber=reversedNumber*10+number%10;
    number=number/10;
    }
    return originalNumber==reversedNumber;
    }
```

## Factorial of a Number

**Problem -** Find factorial of the given number.

| Input |                Process | Outcome |
|------:|-----------------------:|--------:|
|     4 |          1 x 2 x 3 x 4 |      24 |
|     6 |  1 x 2 x 3 x 4 x 5 x 6 |     720 |
|    10 | 1x 2 x 3. . . x 9 x 10 | 3628800 |

**Iterative Approach**

Time Complexity - θ(N), Auxilary Space Complexity - θ(1)

```java
  private static int factorialThroughIteration(final int number){
    int factorial=1;
    for(int i=1;i<=number;i++){
    factorial=factorial*i;
    }
    return factorial;
    }

```

**Recursive Approach**

Time Complexity - θ(N), Auxilary Space Complexity - θ(1)

```java
  private static int factorialThroughRecursion(int number){
    if(number==0){
    return 1;
    }
    return number*factorialThroughRecursion(number-1);
    }
```

## Trailing Zeros in Factorial

## GCD or HCF of Two Numbers

## LCM of Two Numbers

## Check for Prime

## Prime Factors

## All Divisors of a Number

## Sieve of Eratosthenes

## Computing Power

## Iterative Power