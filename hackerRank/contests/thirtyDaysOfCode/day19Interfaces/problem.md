http://www.hackerrank.com/contests/30-days-of-code/challenges/day-19-interfaces

Welcome to Day 19! Check out a video review of interfaces here, or just jump right into the problem.

Interfaces are an important concept in Java and in a few other languages like C#.

Here you are given an interface AdvancedArithmetic which contains a method signature 
int divisorSum(int n). (The divisorSum function just takes an integer as input and return the sum of all its divisors.) Your only task is to write a class Calculator which implements the interface.

Note : The class Calculator shouldn't be public.

Good luck!

Input Format

Only one line containing integer n

Constraints 
1<=n<=1000

Output Format

In the first line print "I implemented: AdvancedArithmetic" without quotes. In the next line print the sum of divisors of n as given in problem statement.

Sample Input
```
6
```
Sample Output

I implemented: AdvancedArithmetic
```
12
```
Explanation

Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.

Default Code:
```
import java.io.*;
import java.util.*;
interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
```