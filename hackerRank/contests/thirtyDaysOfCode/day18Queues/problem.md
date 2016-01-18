http://www.hackerrank.com/contests/30-days-of-code/challenges/day-18-queues-stacks

Welcome to Day 18! Review this queues and stacks video and the Java documentation for implementing stacks and queues, or just jump right into the problem.

A palindrome is a "word, phrase, number, or other sequence of characters which reads the same backwards and forwards." Can you determine if a given string, s, is a palindrome?

To solve this challenge, we must first take each character in s, enqueue it in a queue, and also push it onto a stack. Once that's done, we must dequeue the first character from the queue and pop the top character off the stack, then compare the two characters to see if they are the same; as long as the characters match, we continue dequeueing, popping, and comparing each character until our containers are empty (a non-match means s isn't a palindrome).

Write the following four functions/methods in class Palindrome:

void pushCharacter(char ch): Pushes a character onto a stack.
void enqueueCharacter(char ch): Enqueues a character in a queue.
char popCharacter(): Pops and returns the top character.
char dequeueCharacter(): Dequeues and returns the first character.
Code handling Input/Output and determining if s is palindrome is provided in the editor.

Input Format

A single line containing string s.

Note: s will always be lowercase.

Output Format

If s is a palindrome, print "The word, s, is a palindrome." 
Otherwise, print "The word, s, is not a palindrome." without quotes

Sample Input
```
racecar
```
Sample Output
```
The word, racecar, is a palindrome.
```

Example code:
```
import java.io.*;
import java.util.*;
class Palindrome {
    //Write your code here

}
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}
```
