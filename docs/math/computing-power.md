# Computing Power

## Problem
Given numbers x and n, compute the x to the power of n.

## Solution

### [Power.java](../../src/main/java/com/math/Power.java)
[BinaryExponentiation.java](../../src/main/java/com/math/BinaryExponentiation.java)

### Method 1 - Naive

```java
  private static int power_naive(int x, int n) {
    int power = 1;
    for (int i = 0; i < n; i++) {
      power = power * x;
    }
    System.out.println(x + "^" + n + "=" + power);
    return power;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|      θ(n)       |            θ(1)            |

### Method 2 - Binary Exponentiation - Recursive

$x^n$ can be represented as $x^\frac{n}{2} * x^\frac{n}{2}$ for even n and 
$x * x^\frac{n}{2} * x^\frac{n}{2}$ for odd n.

```java
  private static int power_recursive(int x, int n) {
    if (n == 0) {
      return 1;
    }
    int powerNby2 = power_recursive(x, n / 2);
    int power;
    if (n % 2 == 0) {
      power = powerNby2 * powerNby2;
    } else {
      power = x * powerNby2 * powerNby2;
    }
    System.out.println(x + "^" + n + "=" + power);
    return power;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|    O(log(n))    |         O(log(n))          |


### Method 3 - Binary Exponentiation - Iterative
While recursive method of binary exponentiation computes it in log(n) time, it takes log(n) 
space, which can be reduced to constant space using recursive method.

#### Tips:
Every number can be representation of sum of powers of 2(Binary representation). we can 
represent n as sum of powers of 2 and calculate the exponent accordingly.


```java
  private static int power_binaryExpo(int x, int n) {
    int tempN = n;
    int power = 1;
    while (n > 0) {
      if (n % 2 != 0) {
        power = power * x;
      }
      x = x * x;
      n = n / 2;
    }
    System.out.println(x + "^" + tempN + "=" + power);
    return power;
  }
```
A slight modification with bit-wise operation

```java
  private static int power_binaryExpo_bitmagic(int x, int n) {
    int tempN = n;
    int power = 1;
    while (n > 0) {
      if ((n & 1) == 1) {
        power = power * x;
      }
      x = x * x;
      n = n >> 1;
    }
    System.out.println(x + "^" + tempN + "=" + power);
    return power;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|     θ(log(n))   |            θ(1)            |

___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)