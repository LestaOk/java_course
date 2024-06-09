
HomeWork1
==

Task1: Video duration
--

Given a string representing the length of a video in the format mm:ss, such as 12:44. Write a function that returns the total length of the video in seconds.

Remarks:
- If the string is incorrect, for example, the number of seconds is 60 or more, return -1. 
- The number of minutes is not limited, for example, 999:59 is a valid input.

Task2: Number of Digits
--
Write a function that returns the number of digits in the decimal form of a number.
Using string conversion is not allowed.

Task3: Nested Array
--
Write a function that returns true if the first array can be nested within the second array, and false otherwise.

An array can be nested if:
- min(a1) is greater than min(a2)
- max(a1) is less than max(a2)

Task4: Broken String
--
All my strings got mixed up, and every pair of characters has swapped places.
Write a Java function that fixes such strings and returns them in the correct order.

Task5: Specific Palindrome
--
We will call the descendant of a number a new number created by summing each pair of adjacent digits.

For example, the number 123312 is not a palindrome, but its descendant 363 is:

3 = 1 + 2; 6 = 3 + 3; 3 = 1 + 2

Write a function that will return true if a number is a palindrome or if any of its descendants with a length > 1 (at least 2 digits) is a palindrome.

Task6: Kaprekar's Constant
--
Choose any four-digit number
n
n, greater than 1000, in which not all digits are the same.

Arrange the digits in ascending order, then in descending order.
Subtract the smaller number from the larger one. When rearranging the digits and subtracting, leading zeros should be preserved.
This operation is called Kaprekar's function K(n).

By repeating this process with the resulting differences, we will reach the number 6174 in no more than seven steps, after which it will reproduce itself.

This property of the number 6174 was discovered in 1949 by the Indian mathematician D. R. Kaprekar, after whom it is named.

Example of K(3524):

5432 – 2345 = 3087; 

8730 – 0378 = 8352;

8532 – 2358 = 6174;

7641 – 1467 = 6174

You need to write a recursive function that, for a given number, returns the number of steps required to reach 6174.

For example, for the number above, the answer will be 3.

Task7: Cyclic Bit Shift
--
Java has basic bitwise operations, but it lacks cyclic bit shift operations.

Write 2 functions:

int rotateLeft(int n, int shift)

int rotateRight(int n, int shift)

where:
- n is a positive integer
- shift is the size of the cyclic shift