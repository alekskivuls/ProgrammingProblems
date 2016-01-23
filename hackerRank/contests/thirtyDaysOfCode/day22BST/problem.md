http://www.hackerrank.com/contests/30-days-of-code/challenges/day-22-binary-search-trees

Welcome to Day 22! Check out a video review of binary search trees and heaps here, or just jump right into the problem.

The height of a binary tree is the number of nodes on the largest path from root to any leaf. You are given a pointer root pointing to the root of a binary search tree. Return the height of the tree. 
You only have to complete the function getHeight given in the editor.

Input Format

First line contains T, the number of test cases. Next T lines contain an integer data to be added to the binary search tree.

Output Format

Output the height of the binary search tree.

Sample Input
```
7
3
5
2
1
4
6
7
```
Sample Output
```
4
```
Explanation

The Binary Search tree formed with the given values is
```
      3  
     /  \
    2    5
   /    /  \
  1    4    6
             \
              7
```
The maximum length root to leaf path is 3->5->6->7. There are 4 nodes in this path. Therefore the height of the binary tree = 4.

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
	public static int getHeight(Node root){
      //Write your code here
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur=new Node(data);
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
```