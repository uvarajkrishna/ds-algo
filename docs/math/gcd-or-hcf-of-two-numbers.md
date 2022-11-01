# GCD or HCF of Two Numbers

## Problem

Given two number (a, b), what is the highest number that can divide both a and b.

|  Input   | Output |
|:--------:|-------:|
|  4 , 6   |      2 |
| 100, 200 |    100 |
|   7,13   |      1 |

## Solution

### [Gcd.java](../../src/main/java/com/math/Gcd.java)

### Method 1 - Iterative

```java
  private static int gcd_naive(int a, int b) {
    int min = Math.min(a, b);
    int factor = 1;
    for (int i = min; i >= 1; i--) {
      if (a % i == 0 & b % i == 0) {
        factor = i;
        break;
      }
    }
    return factor;
  }
```

| Time Complexity |  Auxiliary Space Complexity  |
|:---------------:|:----------------------------:|
|  O(min(a, b))   |             O(1)             |

### Method 2 - Euclidean

```java
  private static int gcd_euclids(int a, int b) {
    while(a!=b){
      if (a > b) {
         a = a-b;
      } else {
        b = b-a;
      }
    }
    return a;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|  O(min(a, b))   |            O(1)            |

### Method 3 - Euclidean Improved

```java
  private static int gcd_euclids_improved(int a, int b) {
    if (b == 0) {
    return a;
    }
    return gcd_euclids_improved(b, a % b);
    }
```

|  Time Complexity  | Auxiliary Space Complexity |
|:-----------------:|:--------------------------:|
| O(log(min(a, b))) |     O(log(min(a, b)))      |

___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)