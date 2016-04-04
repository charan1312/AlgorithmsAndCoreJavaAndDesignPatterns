package edu.asu.foa.algo.leetcode;

import java.util.List;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}


public class DeleteNodeSLL {
	
	ListNode head;
	
	public void deleteNode(ListNode node) {
		
		System.out.println(node.val + "-->" + node.next.val);
		if(node.next == null) {
			return;
		} else {
			System.out.println("inside else");
			node.val = node.next.val;
			node.next = node.next.next;
		}
		
/*		System.out.println("All Nodes after:");
		ListNode h = head;
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);
*/
	}
	
	
	public static void main(String[] args) {
		
		DeleteNodeSLL d = new DeleteNodeSLL();
		d.head = new ListNode(1);
		ListNode a = new ListNode(2);
		ListNode b = new ListNode(3);
		ListNode c = new ListNode(4);
		
		b.next = c;
		a.next = b;
		d.head.next = a ;
		System.out.println("All Nodes:");
		ListNode h = d.head;
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);
		System.out.println();
		
		h = d.head;
		d.deleteNode(b);
		System.out.println("All Nodes after delete:");
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);		
		
	}
}
