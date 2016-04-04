package edu.asu.foa.algo.leetcode;

import java.util.List;
import java.util.Stack;

class ListNode1 {
	int val;
	ListNode1 next;
	ListNode1(int x) { val = x; }
}

public class ReverseSLL {

	static ListNode1 head, o;
	
	public static void main(String[] args) {

		head = new ListNode1(1);
		ListNode1 a = new ListNode1(2);
		ListNode1 b = new ListNode1(3);
		ListNode1 c = new ListNode1(4);
		ListNode1 d = new ListNode1(5);
		ListNode1 e = new ListNode1(6);
		ListNode1 f = new ListNode1(7);
		e.next = f;
		d.next = e;
		c.next = d;
		b.next = c;
		a.next = b;
		head.next = a ;
		
		System.out.println("All Nodes:");	
		ListNode1 h = head;
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
/*		System.out.print(h.val);
		System.out.println();
		
		h = reverseList(head);
		
		System.out.println("All Nodes after reverse:");	
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);
		System.out.println();
*/		
		System.out.println("HEAD: "+ head.val + head.next.val);
		h = reverseListUsingStack(head);
		
		System.out.println("All Nodes after reverse using stack:");	
		while(h.next != null) {
			System.out.print(h.val + "-->");
			h = h.next;
		}
		System.out.print(h.val);
		System.out.println();
	}

	static ListNode1 reverseList(ListNode1 head2) {
		
		if(head == null || head.next == null)
			return head;
		 
		ListNode1 cur = head2;
		ListNode1 prev = null;
		ListNode1 next = cur.next;
		
		while(next != null) {
			cur.next = prev;
			prev = cur;
			cur = next;
			if(next.next != null)
				next = next.next;
			else 
				next = null;
		}
		cur.next = prev; 
		return cur;
	}

	static ListNode1 reverseListUsingStack(ListNode1 head2) {
		System.out.println("Inside using stack");
		if(head2 == null || head2.next == null)
			return head2;
		
		Stack<ListNode1> s = new Stack<ListNode1>();
		
		while(head2.next != null) {
			s.push(head2);
			head2 = head2.next;
		}
		s.push(head2);

		ListNode1 temp ;
		o = s.pop();
		System.out.println("O val:" +o.val);
		temp = o;
		while(!s.isEmpty()) {
			temp.next = s.pop();
			temp = temp.next;
		}
		temp.next= null;
		
		return o;
	}
}











