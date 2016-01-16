package hackerRank.contests.thirtyDaysOfCode.day15LinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

public class LinkedList { // Write code here
	public static Node insert(Node head, int data) {
		if (head == null)
			head = new Node(data);
		else {
			Node ptr = head;
			while (ptr.next != null)
				ptr = ptr.next;
			ptr.next = new Node(data);
		}
		return head;
	}

	// End editable code
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);

	}
}