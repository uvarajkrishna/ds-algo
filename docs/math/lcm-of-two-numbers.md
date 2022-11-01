# LCM of Two Numbers

## Problem

Given two number a and b, find the least number divisible by both a and b.

| Input  | Output |
|:------:|-------:|
| 4 , 6  |     12 |
| 12, 15 |     15 |

## Tips

a x b = gcd(a, b) x lcm
lcm = (a x b)/gcd(a, b)

## Solution

### [Lcm.java](../../src/main/java/com/math/Lcm.java)

### Method 1 - Naive

```java
  private static int lcm_naive(int a,int b){
    int lcm=a*b;
    for(int i=Math.max(a,b);i<=lcm;i++){
    if(i%a==0&&i%b==0){
    lcm=i;
    break;
    }
    }
    return lcm;
    }
```

### Method 2 - Formula

```java
  private static int lcm_formula(int a,int b){
    return a*b/gcd_euclids_improved(a,b);
    }
```

|  Time Complexity  | Auxiliary Space Complexity |
|:-----------------:|:--------------------------:|
| O(log(min(a, b))) |     O(log(min(a, b)))      |

Complexity is same as GCD method used.
___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)