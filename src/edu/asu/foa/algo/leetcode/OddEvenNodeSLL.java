package edu.asu.foa.algo.leetcode;

import java.util.List;

class Node {
	int val;
	Node next;
	Node(int x) { val = x; }
}


public class OddEvenNodeSLL {
	
	static Node head;
	
	public void deleteNode(Node node) {
		
		System.out.println(node.val + "-->" + node.next.val);
		if(node.next == null) {
			return;
		} else {
			System.out.println("inside else");
			node.val = node.next.val;
			node.next = node.next.next;
		}
		
/*		System.out.println("All Nodes after:");
		Node h = head;
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);
*/
	}
	
	
	public static void main(String[] args) {
/*		
		head = new Node(1);
		Node a = new Node(2);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(6);
		Node f = new Node(7);
		e.next = f;
		d.next = e;
		c.next = d;
		b.next = c;
		a.next = b;
		head.next = a ;
*/		
		System.out.println("All Nodes:");	
		Node h = head;
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);
		System.out.println();
		
		//if(head == null || head.next == null)
		//	return head;
		Node odd = head;
		Node even = head.next;
		Node even1 = even;
		while(odd.next != null && even.next != null) {
			if(even.next != null) {
				odd.next = even.next;
				odd = odd.next;
				System.out.println(odd.val +"--" + even.val);
			} else {
				odd.next = null;
			}
			
			if(odd.next != null) {
				even.next = odd.next;
				even = even.next;
				System.out.println(odd.val +"--" + even.val);
			} else {
				even.next = null;
			}
		}
		odd.next = even1;
			
		
		
		h = head;
		//d1.deleteNode(b);
		System.out.println("All Nodes after change:");
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);		

	}
}
