package edu.asu.foa.algo.controller;

import java.util.HashSet;
import java.util.Set;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

public class DoublyLinkedListTest {
	Node head;

	static class Node{
		int data;
		Node next;
		Node prev;
		Node(int d) {
			data = d;
			next = null;
			prev = null;
		}
	}

	public void printListFromHead() {
		Node n = head;

		if(n.next == null){
			System.out.print(n.data);
			return;
		}
		while(n.next != null) {
			System.out.print(n.data + "--->");
			n = n.next;
		}
		System.out.println(n.data);
		
	}
	
	
	public void printListFromTail() {
		Node n = head;
		
		if(n.next == null){
			System.out.print(n.data);
			return;
		}
		
		while(n.next != null) {
			n = n.next;
		}
		//System.out.print("END:" + n.data );
		while(n.prev != null) {
			System.out.print(n.data + "<---");
			n = n.prev;
		}
		System.out.println(n.data );
	}
	
	
	public void addNodeatTail(int newData) {
		Node newNode = new Node(newData);
		Node temp = head;
		while (temp.next != null){
			//System.out.println("DATA:"+temp.data);
			temp = temp.next;
		}
		//System.out.println("EXited");
		temp.next = newNode;
		newNode.prev = temp;
	}

	public void addNodeatHead(int newData) {
		Node newNode = new Node(newData);
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}

	public void addafter(int afterData,int data) {
		Node newNode = new Node(data);
		Node temp = head;
		
		while (temp != null){
			if(temp.data == afterData) {
				if(temp.next != null){
					newNode.next = temp.next;
					temp.next.prev = newNode;
				} 
				temp.next = newNode;
				newNode.prev = temp;
			}
			temp = temp.next;
		}
	}


	public void delete(int key) {
		Node temp = head,prev = null;
		if (temp == null) {
			return;
		}
		if (temp != null && temp.data == key) {
			head = temp.next;
			head.prev = null;
			return;
		}

		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp != null && temp.next != null){
			prev.next = temp.next;
			temp.next.prev = prev;
			
		} else if(temp!=null && temp.next == null) {
			prev.next = null;
			temp.prev = null;
		}
		else{
			System.out.println("No such key");
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
		DoublyLinkedListTest dll = new DoublyLinkedListTest();
		
		dll.head = new Node(33);
		
		dll.printListFromHead();
		System.out.println();
		dll.printListFromTail();
		System.out.println();
		
		dll.addNodeatHead(22);
		dll.printListFromHead();
		System.out.println();
		dll.printListFromTail();
		System.out.println();
		
		dll.addNodeatTail(99);
		dll.printListFromHead();
		System.out.println();
		dll.printListFromTail();
		System.out.println();
		
		dll.addafter(22, 44);
		dll.printListFromHead();
		System.out.println();
		dll.printListFromTail();
		System.out.println();
		
		dll.addafter(22, 40);
		dll.printListFromHead();
		System.out.println();
		dll.printListFromTail();
		System.out.println();
		
		dll.addafter(99, 77);
		dll.printListFromHead();
		System.out.println();
		dll.printListFromTail();
		System.out.println();
	}

}
