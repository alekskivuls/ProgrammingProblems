http://www.hackerrank.com/contests/30-days-of-code/challenges/day-17-exceptions

Welcome to Day 17! Learn how to use try-catch blocks in Day 16 and how to create your own exceptions in Day 17 or just jump right into the problem.

Create a class Calculator which consists of a single method power(int,int). This method takes two integers, n and p, as parameters and finds np. If either n or p is negative, then the method must throw an exception which says "n and p should be non-negative".

Code for handling Input/Output is already provided in the editor. Please read the partially completed code in the editor and complete it.

Note: The class Calculator mustn't be public.

No need to worry about constraints, there won't be any overflow if your code is correct.

If you enjoyed this challenge, here's a java only Exception Challenge

Input Format

First line contains T, the number of test cases. Next T lines contain two integers n and p separated by a space.

Output Format

Output T lines. For each test case if n and p are positive then print np else print "n and p should be non-negative" without quotes.

Sample Input
```
4
3 5
2 4
-1 -2
-1 3
```
Sample Output
```
243
16
n and p should be non-negative
n and p should be non-negative
```
Explanation

T=4 
In the first test case both integers are positive hence the output is 35=243 
In the second test case both integers are positive hence the output is 24=16 
In the third test case both the integers are negative hence the output is "n and p should be non-negative" 
In the fourth test case n is negative hence the output is "n and p should be non-negative"

Default Code:
```
import java.util.*;
import java.io.*;
//Write your code here
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
```