# All Divisors of a Number

## Problem
Find all divisors in a sorted order.

## Tips
Divisors occur in pair.

## Solution

Since All divisors occur in pair, we can determine the pair when checking the divisible 
condition. If we do that in a single loop, we will end up with unsorted divisors. 

Hence trick is to split the loop into two parts with i from 1 to √n and repeat the loop from √n to 1 

### [AllDivisors.java](../../src/main/java/com/math/AllDivisors.java)

```java
private static String allDivisors_optimized(final int number) {
    int i;
    StringBuilder builder = new StringBuilder();
    for (i = 1; i * i < number; i++) {
      if (number % i == 0) {
        if (i == 1) {
          builder.append(i);
        } else {
          builder.append(",").append(i);
        }
      }
    }
    for (; i >= 1; i--) {
      if (number % i == 0) {
        builder.append(",").append(number / i);
      }
    }
    String divisors = builder.toString();
    System.out.println(divisors);
    return divisors;
  }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|      O(√n)      |            O(1)            |
___

* [Math - Home](math.md)
* [DS Algo Home](../../README.md)