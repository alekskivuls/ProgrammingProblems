http://www.hackerrank.com/contests/30-days-of-code/challenges/day-23-review-and-binary-trees

Welcome to Day 23! Review everything we've learned so far by making Tic Tac Toe from scratch with this video, or just jump right into the problem.

You are given a pointer root pointing to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. 
For example:
```
         3
       /   \
      5     2
     / \    /
    1   4  6
```
For the above tree, the level order traversal is `3 -> 5 -> 2 -> 1 -> 4 -> 6`.

HINT: A queue could be helpful.

The code for input/output is already handled in the editor. You only have to complete the function levelOrder given in the editor.

Good luck!

Input Format

First line contains T, the number of test cases. Next T lines contain an integer data to be added to the binary search tree.

Output Format

Print the values of the level order traversal separated by spaces.

Sample Input
```
6
3
5
4
7
2
1
```
Sample Output
```
3 2 5 1 4 7 
```
Explanation
```
Level 1:        3
              /   \
Level 2:     2     5
            /     /\
Level 3:   1     4  7 
```
We need to print the nodes level by level. We process each level from left to right. 
Level Order Traversal: `3 -> 2 -> 5 -> 1 -> 4 -> 7`

Default Code:
```
import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
static void levelOrder(Node root){
      //Write your code here
      
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
```