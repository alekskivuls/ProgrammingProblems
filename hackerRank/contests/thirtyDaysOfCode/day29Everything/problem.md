http://www.hackerrank.com/contests/30-days-of-code/challenges/day-29-look-at-everything-weve-learned

Welcome to Day 29! Check out the tutorial on programming language fundamentals, or just jump right into the problem. Congratulations on finishing the series, and good luck!

Suppose you have some string S having length N that is indexed from 0 to N-1. You also have some string R that is the reverse of string S. S is funny if the condition |Si-Si-1|=|Ri-Ri-1| is true for every i from 1 to N-1.

Note: For some string str, stri denotes the ASCII value of the ith 0-indexed character in str. The absolute value of some integer, x, is written as |x|.

Input Format

The first line contains an integer, T (the number of test cases). 
The T subsequent lines each contain one string S.

Constraints 
1<=T<=10 
2<=length of S<=10000
Output Format

For each string S, print whether it is Funny or Not Funny on a new line (i.e.: the ith line of output should be the answer for input string Si).

Sample Input
```
2
acxz
bcxz
```
Sample Output
```
Funny
Not Funny
```
Explanation

Test Case 0: S= "acxz" 
|c-a|=2=|x-z| 
|x-c|=21=|c-x| 
|z-x|=2=|a-c| 
We print Funny.

Test Case 1: S= "bcxz" 
|c-b|=1, but |x-z|=2 
We stop evaluating the string (as |c-b|!=|x-z|), and print Not Funny.