package hackerRank.contests.thirtyDaysOfCode.day23ReviewBST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class ReviewBST {

	static void levelOrder(Node root) { // Write your code here
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		StringBuilder result = new StringBuilder();
		while (!queue.isEmpty()) {
			if (queue.peek().left != null)
				queue.add(queue.peek().left);
			if (queue.peek().right != null)
				queue.add(queue.peek().right);
			result.append(queue.poll().data + " ");
		}
		System.out.println(result.toString().trim());
	} // End written code

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}