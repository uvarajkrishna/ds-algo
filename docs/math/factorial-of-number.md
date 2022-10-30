# Factorial of a Number

## Problem

Find factorial of the given number.

| Input |                Process | Outcome |
|------:|-----------------------:|--------:|
|     4 |          1 x 2 x 3 x 4 |      24 |
|     6 |  1 x 2 x 3 x 4 x 5 x 6 |     720 |
|    10 | 1x 2 x 3. . . x 9 x 10 | 3628800 |

## Solution

### [Factorial.java](../../src/main/java/com/math/Factorial.java)

### Iterative Approach

```java
  private static int factorialThroughIteration(final int number){
    int factorial=1;
    for(int i=1;i<=number;i++){
    factorial=factorial*i;
    }
    return factorial;
    }

```

| Time Complexity |  Auxiliary Space Complexity  |
|:---------------:|:----------------------------:|
|      θ(N)       |             θ(1)             |

### Recursive Approach

```java
  private static int factorialThroughRecursion(int number){
    if(number==0){
    return 1;
    }
    return number*factorialThroughRecursion(number-1);
    }
```

| Time Complexity | Auxiliary Space Complexity |
|:---------------:|:--------------------------:|
|      θ(N)       |            θ(N)            |