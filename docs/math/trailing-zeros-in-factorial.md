# Trailing Zeros in Factorial

## Problem

Find trailing zeros of a factorial.

## Tips

Trailing zeros in a factorial of a number(n) is based on the number pairs of 5 and 2 present util
number(n)

## Solution

### [FactorialTrailingZero.java](../../src/main/java/com/math/FactorialTrailingZero.java)

### Method 1

Find factorial and calculate trailing zero by dividing by 10.

```java
  private static int loopMethod(final int number) {
    long factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }
    long tempFact = factorial;
    int trailingZeros = 0;
    while (factorial % 10 == 0) {
      trailingZeros++;
      factorial = factorial / 10;
    }
    System.out.println(number + " - " + tempFact + " - " + trailingZeros);
    return trailingZeros;
  }
```

| Time Complexity |  Auxiliary Space Complexity  |
|:---------------:|:----------------------------:|
|      θ(N)       |             θ(1)             |

This method will cause overflow of factorial variable values when n is larger.

### Method 2

Upon analysing the number of 5 and 2 pairs before n, one could notice the following pattern.

1 x **2** x 3 x 4 x **5** x 6 x 7 x 8 x 9 x **10** x 11 x 12 x 13 x 14 x **15**

1....5....15...10...15...25...50.......125.......625

1....**5**....**5** x 3...**5** x 2...**5** x 3...**5** x **5**...**5** x **5** x
2.......125.......625

Number trailing zeros can be determined by below Legendre’s Formula

![Legendre’s Formula](legendres-formula.png)

n/5 + n/25 + n/125..... until p^i <= n

```java
  private static int seriesMethod(final int number) {
    int count = 0;
    for (int i = 5; i <= number; i *= 5) {
      count = count + number / i;
    }
    System.out.println(number + " - " + "...." + " - " + count);
    return count;
  }
```

| Time Complexity |  Auxiliary Space Complexity  |
|:---------------:|:----------------------------:|
|    θ(log(N))    |             θ(1)             |

___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)