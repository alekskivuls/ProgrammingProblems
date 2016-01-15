http://www.hackerrank.com/contests/30-days-of-code/challenges/day-14-scope-and-imports

Welcome to Day 14! Congratulations on getting half way through the series! Check out a video review of scope and importing here, or just jump right into the problem.

In this challenge, you will create a program that takes N non-negative integers as input and finds the greatest absolute difference between two of the N integers, and then print this difference to the console.

There is a class Difference given in the editor with one private instance array elements which stores the N non negative integers and public integer maxDifference to store the greatest absolute difference between the two of the N integers.

Code for handling input/output is already given in the editor. Your task is to write the constructor for the class Difference and the method computeDifference which finds the greatest absolute difference between any two numbers in the input array and stores it in maxDifference.

Good Luck!

Input Format

First line contains an integer N representing size of the array. Next line contains N integers separated by space.

Constraints 
* 1<=N<=10 
* 1<=elements[i]<=100 where 1<=i<=N

Output Format

Output the the greatest absolute difference between two of N integers in the array.

Sample Input
```
3
1 2 5
```
Sample Output
```
4
```
Explanation
```
|1-2|=1  
|1-5|=4  
|2-5|=3  
```
Hence 4 is the largest.