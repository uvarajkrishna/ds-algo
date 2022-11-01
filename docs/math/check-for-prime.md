# Check for Prime

## Problem

Given a number n, check if the number is prime.

## Tips

Divisors always occur in pairs.

## Solution

### [Prime.java](../../src/main/java/com/math/Prime.java)

### Method 1 - Naive

Check if the number is divisible by any number less than n itself.

```java
  private static boolean isPrime_naive(final int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|      O(n)       |            O(1)            |

### Method 2 - Efficient

Since divisors occurs in pairs, it is enough to check till square root of n instead of n.
Because for any number to occur beyond that must have smaller divisor which must be present
before square root of n.

```java
  private static boolean isPrime_efficient(final int n) {
    for (int i = 2; i * i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|   O(sqrt(n))    |            O(1)            |

___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)