# Palindrome Numbers

## Problem

Check whether the given number is palindrome.

| Input |  Output |
|------:|--------:|
| 12345 |   False |
|   111 |    True |
|  1221 |    True |

## Tips

Use divide by 10 approach. But this time use temp variable to store right most number
sliced using modulo of ten.

## Solution

### [Palindrome.java](../../src/main/java/com/math/Palindrome.java)

```java
  public static boolean isPalindrome(int number){
    if(number< 0){
    return false;
    }
    if(number< 10){
    return true;
    }
    int reversedNumber=0;
    int originalNumber=number;
    while(number>0){
    reversedNumber=reversedNumber*10+number%10;
    number=number/10;
    }
    return originalNumber==reversedNumber;
    }
```
