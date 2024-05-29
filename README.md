
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