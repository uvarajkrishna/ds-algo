# Counting Digits

## Problem

Count the number of digits in a given number.

|  Input |  Output |
|-------:|--------:|
|  12345 |       5 |
|    111 |       3 |

## Tips

Divide Number by 10 until it is equal to zero. Number of times divided will lead to
number of digits.

## Solution

### [CountDigits.java](../../src/main/java/com/math/CountDigits.java)

```java
  private static int countOfDigitsIn(int number){
    int count=0;
    while(number!=0){
    number=number/10;
    count++;
    }
    return count;
    }
```
