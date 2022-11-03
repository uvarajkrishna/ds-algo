# Computing Power

## Problem
Given numbers x and n, compute the x to the power of n.

## Solution

### [Power.java](../../src/main/java/com/math/Power.java)

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

### Method 2 - Even Odd

$x^n$ can be represented as $(x^(n/2)) * (x^(n/2))$ for even n and $x * (x^(n/2)) * (x^(n/2))$ for 
odd n.

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

___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)