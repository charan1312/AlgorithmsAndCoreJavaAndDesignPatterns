package edu.asu.foa.algo.controller;

import java.util.HashSet;
import java.util.Set;

public class LinkedListTest {
	Node head;

	static class Node{
		int data;
		Node next;
		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void printList() {
		Node n;
		n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	public void addNodeatEnd(Node n) {
		Node temp = head;
		while (temp.next != null){
			//System.out.println("DATA:"+temp.data);
			temp = temp.next;
		}
		//System.out.println("EXited");
		temp.next = n;
	}

	public void push(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void addafter(int afterData,int data) {
		Node newNode = new Node(data);
		Node temp = head;
		
		while (temp != null){
			if(temp.data == afterData) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
			temp = temp.next;
		}
	}

	public void insertAfter(Node prev_node, int new_data) {
		if (prev_node == null) {
			System.out.println("The given previous node cannot be null");
			return;
		}

		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	public void append(int newData) {

		Node newNode = new Node(newData);
		if(head == null) {
			head = newNode;
			return;
		}

		Node last  = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = newNode;
		return;
	}

	public void delete(int key) {
		Node temp = head,prev = null;
		if (temp == null) {
			return;
		}
		if (temp != null && temp.data == key) {
			head = temp.next;
			return;
		}

		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if(temp!=null){
			prev.next = temp.next;
		} else{
			System.out.println("No such key");
		}
	}

	public void deleteByPos(int pos) {
		Node temp = head;
		if (temp == null) {
			return;
		}
		if (temp != null && pos == 0) {
			head = temp.next;
			return;
		}
		for(int i=1; temp.next!=null && i<pos ; i++) {
			temp = temp.next;
			System.out.println("Current Node:" +temp.data);
		}

		if(temp.next == null) {
			System.out.println("Position not present");
			return;
		}
		else {
			Node next = temp.next.next;
			temp.next = next;
		}

	}
	
	public int countNonRec() {
		int i = 0;
		Node temp = head;
		if(temp == null) {
			return 0;
		}
		else {
			i = 1;
		}
		while (temp.next != null){
			i++;
			temp = temp.next;
		}
		return i;
	}
	
	public int countRec(Node temp) {
		if (temp == null)
			return 0;
		else 
			return 1 + countRec(temp.next);
	}
	
	public boolean search(Node temp, int key) {
		if (temp == null)
			return false;
		if(temp.data == key)
			return true;
		else
			return search(temp.next,key);
	}

	public static void main(String[] args) {
		LinkedListTest ll = new LinkedListTest();
		
/*		int size = ll.countRec(ll.head);
		System.out.println("Size using recursion:" + size);
		
		ll.head = new Node(1);
		ll.printList();
		System.out.println("before");

		
		ll.deleteByPos(0);
		ll.printList();
		System.out.println("after");
*/
		////////////////////          TEST FOR PRESENCE OF A CYCLE          ///////////////
		
		ll.head = new Node(1);
		ll.append(2);
		ll.append(3);
		ll.append(33);
		ll.append(4);
		ll.append(5);
		ll.printList();
		
		Node n = new Node(6);
		n.next = ll.head;
		ll.addNodeatEnd(n);
		
		Node slow = ll.head;
		Node fast = ll.head;
		Node same = null;
		Node startofloop = null;
		while(slow !=null && fast!=null && fast.next !=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("CYCLE DETECTION THRU SLOW AND FAST METHOD----"+slow.data);
				same = slow;
				break;
			}
		}
		//System.out.println("CYCLE NOT PRESENT - THRU SLOW AND FAST METHOD");
		System.out.println("SAME IS :" + same.data);
		Node temp1 = ll.head;
		System.out.println(temp1.hashCode() + "*********************" +same.hashCode());
		while (temp1.hashCode() != same.hashCode()) {
			System.out.println(temp1.data + "===" +same.data);
			temp1 = temp1.next;
			same = same.next;
		}
		if(temp1.hashCode() == same.hashCode()) {
			startofloop = temp1;
			System.out.println(startofloop.data);
		}	
		
		Node temp2 = ll.head;
		 
		while(temp2 != null) {
			if((temp2.next.hashCode() == startofloop.hashCode()))
				temp2.next = null;
			temp2 = temp2.next;
		}
		
		
		Node temp = ll.head;
		Set<Integer> keys = new HashSet<Integer>(); 
		while(temp != null){
			if(!keys.contains(temp.hashCode())){
				keys.add(temp.hashCode());
			} else {
				System.out.println("CYCLE DETECTION THRU HASHCODES IN THE SET");
				//temp.next = null;                    - THIS WONT WORK TO REMOVE THE CYCLE
				break;
			}
			temp = temp.next;
		}
		ll.printList();
		//System.out.println("CYCLE NOT PRESENT - THRU HASHCODES IN THE SET");
		
		//ll.printList();
/*
		size = ll.countNonRec();
		System.out.println("Size using non-rec:" + size);
		
		size = ll.countRec(ll.head);
		System.out.println("Size using recursion:" + size);
		
		Node second = new Node(2);
		Node third = new Node(3);

		ll.head.next = second;
		size = ll.countNonRec();
		System.out.println("Size using non-rec:" + size);

		second.next = third;
		size = ll.countNonRec();
		System.out.println("Size using non-rec:" + size);

		ll.printList();
		System.out.println();
		
		ll.push(5);
		ll.printList();
		System.out.println();
		
		ll.insertAfter(ll.head.next, 7);
		ll.printList();
		System.out.println();
		
		size = ll.countNonRec();
		System.out.println("Size using non-rec:" + size);
		
		ll.append(11);
		ll.append(14);
		ll.printList();
		System.out.println();
		ll.delete(897);
		
		ll.printList();
		System.out.println();
		ll.delete(897);
		
		
		size = ll.countRec(ll.head);
		System.out.println("Size using recursion:" + size);
		int key = 11;
		boolean flag = ll.search(ll.head, key);
		System.out.println("Key " + key + " present in list:" + flag );
		/*
		ll.deleteByPos(0);
		ll.printList();
		System.out.println();
		
		ll.deleteByPos(1);
		ll.printList();
		System.out.println();
		
		ll.deleteByPos(2);
		ll.printList();
		System.out.println();
		
		ll.deleteByPos(4);
		ll.printList();
		System.out.println();
		*/		
	}

}
