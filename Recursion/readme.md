# Recursion Programs

This document provides detailed explanations for each of the recursion programs included in this directory.

## sumofNnum.java

This program calculates the sum of the first `n` natural numbers using recursion.

### Explanation:
1. **Base Case:** If `x` is 1, return 1.
2. **Recursive Case:** Calculate the sum of numbers up to `x-1` and add `x` to it.

### Example:
For `n = 5`, the sum is calculated as:
```
sum(5) = 5 + sum(4)
sum(4) = 4 + sum(3)
sum(3) = 3 + sum(2)
sum(2) = 2 + sum(1)
sum(1) = 1
```
So, `sum(5) = 5 + 4 + 3 + 2 + 1 = 15`.

## sortedArray.java

This program checks if an array is sorted in ascending order using recursion.

### Explanation:
1. **Base Case:** If the current index `i` is the last index, return true.
2. **Recursive Case:** Check if the current element is greater than the next element. If true, return false. Otherwise, check the next pair.

### Example:
For `arr = {1, 2, 3, 4}`, the function will return `true` as the array is sorted.

## Power.java

This program calculates the power of a number using two methods: a simple recursive method and an optimized method.

### Explanation:
1. **Simple Method (O(n)):** Multiply the number by itself `power` times.
2. **Optimized Method (O(log n)):** Use the property `(a^b) = (a^(b/2)) * (a^(b/2))` to reduce the number of multiplications.

### Example:
For `number = 2` and `power = 10`, both methods will return `1024`.

## removeDuplicate.java

This program removes duplicate characters from a string using recursion.

### Explanation:
1. **Base Case:** If the current index is the length of the string, print the result.
2. **Recursive Case:** If the character is not a space and has not been seen before, add it to the result and mark it as seen.

### Example:
For `str = "Parth Singh"`, the function will return `parthsing`.

## lastOccurence.java

This program finds the last occurrence of a key in an array using recursion.

### Explanation:
1. **Base Case:** If the current index is -1, return -1.
2. **Recursive Case:** If the current element is the key, return the index. Otherwise, check the previous element.

### Example:
For `arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 10}` and `key = 5`, the function will return `8`.

## Inc_and_dec.java

This program prints numbers in increasing and decreasing order using recursion.

### Explanation:
1. **Increasing Order:** Print numbers from 1 to `n`.
2. **Decreasing Order:** Print numbers from `n` to 1.

### Example:
For `n = 10`, the increasing order will be `1 2 3 4 5 6 7 8 9 10` and the decreasing order will be `10 9 8 7 6 5 4 3 2 1`.

## firstOccurence.java

This program finds the first occurrence of a key in an array using recursion.

### Explanation:
1. **Base Case:** If the current index is the length of the array, return -1.
2. **Recursive Case:** If the current element is the key, return the index. Otherwise, check the next element.

### Example:
For `arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}` and `key = 5`, the function will return `4`.

## fibonacci.java

This program calculates the Fibonacci sequence using recursion.

### Explanation:
1. **Base Case:** If `x` is 0 or 1, return `x`.
2. **Recursive Case:** Return the sum of the previous two Fibonacci numbers.

### Example:
For `x = 5`, the function will return `5` (sequence: 0, 1, 1, 2, 3, 5).

## factorial.java

This program calculates the factorial of a number using recursion.

### Explanation:
1. **Base Case:** If `x` is 0 or 1, return 1.
2. **Recursive Case:** Multiply `x` by the factorial of `x-1`.

### Example:
For `x = 5`, the function will return `120` (5 * 4 * 3 * 2 * 1).

