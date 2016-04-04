package edu.asu.foa.algo.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTreeDemo {

	Node root;
	static Node pr;
	static int iter = 0 ;
	static class Node {
		int data;
		Node left;
		Node right;
		public Node(int val) {
			data = val;
		}
	}

	public void insert(Node n,int val) {
		//System.out.println("N.data value:" + n.data + " N.left:" +n.left + " N.Right val:" + n.right + " VAl:" + val);
		if(val < n.data) {
			//System.out.println("Inside left branch");
			if(n.left == null) {
				//System.out.println("Left leaf");
				n.left = new Node(val);
				return;
			} else {
				//System.out.println("Left non-leaf");
				insert(n.left,val);	
			}
		} else if(val > n.data) {
			//System.out.println("Inside right branch");
			if (n.right == null) {
				//System.out.println("Right leaf");
				n.right = new Node(val);
				return;
			} else {
				//System.out.println("Right non-leaf");
				insert(n.right, val);
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTreeDemo btd = new BinarySearchTreeDemo();
		/*
 		btd.root = new Node(70);

		btd.insert(btd.root, 56);
		btd.insert(btd.root, 79);
		btd.insert(btd.root, 43);
		btd.insert(btd.root, 63);
		btd.insert(btd.root, 73);
		btd.insert(btd.root, 83);

		System.out.println("Inorder Taversal:");
		btd.inOrderTraversal(btd.root);
		System.out.println("\nPreorder Taversal:");
		btd.preOrderTraversal(btd.root);
		System.out.println("\nPostorder Taversal:");
		btd.postOrderTraversal(btd.root);
		System.out.println();
		btd.search(btd.root, 45);
		btd.search(btd.root, 79);

		btd.insert(btd.root, 54);
		System.out.println("Inorder Taversal:");
		btd.inOrderTraversal(btd.root);

		btd.delete(btd.root, 43);
		System.out.println("Inorder Taversal:");
		btd.inOrderTraversal(btd.root);
		 */		

		List<Node> nodesofCBT = new LinkedList<Node>();
		//		List<Node> nodesofCBT = new ArrayList<Node>();

		Node n1= new Node(10);
		Node n2= new Node(12);
		Node n3= new Node(15);
		Node n4= new Node(25);
		Node n5= new Node(30);
		Node n6= new Node(36);

		nodesofCBT.add(n1);
		nodesofCBT.add(n2);
		nodesofCBT.add(n3);
		nodesofCBT.add(n4);
		nodesofCBT.add(n5);
		nodesofCBT.add(n6);

		//System.out.println(nodesofCBT.get(0).data);

		//nodesofCBT.remove(0);
		//System.out.println(nodesofCBT.get(0).data);

		Node newRoot = btd.convertListOfNodeToCBT(nodesofCBT);      // This method deals with a binary tree not necessarily BST
		btd.inOrderTraversal(newRoot);


		System.out.println();
		System.out.println("TESTING FOR THE BST OPERATIONS START");

		BinarySearchTreeDemo bstdemo = new BinarySearchTreeDemo();

		bstdemo.root = new Node(15);
		bstdemo.insert(bstdemo.root,10);
		bstdemo.insert(bstdemo.root,21);
		bstdemo.insert(bstdemo.root,3);
		bstdemo.insert(bstdemo.root,11);
		bstdemo.insert(bstdemo.root,17);
		bstdemo.insert(bstdemo.root,28);
		bstdemo.insert(bstdemo.root,1);
		bstdemo.insert(bstdemo.root,8);
		bstdemo.insert(bstdemo.root,16);
		bstdemo.insert(bstdemo.root,20);
		bstdemo.insert(bstdemo.root,25);
		bstdemo.insert(bstdemo.root,31);
		bstdemo.insert(bstdemo.root,4);
		bstdemo.insert(bstdemo.root,9);

		System.out.println("Initial In-Order Traversal");
		bstdemo.inOrderTraversal(bstdemo.root);

		System.out.println("\nAfter Deleting node 21, the In-Order Traversal is:");
		bstdemo.deleteInterface(bstdemo.root, 25);
		System.out.println(bstdemo.root.data);
		bstdemo.inOrderTraversal(bstdemo.root);
	}


	private Node convertListOfNodeToCBT(List<Node> nodesofCBT) {
		// TODO Auto-generated method stub
		List<Node> ll = nodesofCBT;
		Queue<Node> q = new LinkedList<BinarySearchTreeDemo.Node>();
		Node head = ll.get(0);
		q.add(head);
		ll.remove(0);

		while(!ll.isEmpty()) {
			Node toconstruct = q.peek();
			System.out.println(toconstruct.data);
			q.remove();
			if(!ll.isEmpty()) {
				toconstruct.left = ll.get(0);
				q.add(ll.get(0));
				ll.remove(0);
			}
			if(!ll.isEmpty()) {
				toconstruct.right = ll.get(0);
				q.add(ll.get(0));
				ll.remove(0);
			}
		}

		return head;
	}

	public void inOrderTraversal(Node n) {
		if(n.left != null)
			inOrderTraversal(n.left);
		System.out.print(n.data + " ");
		if(n.right!=null)
			inOrderTraversal(n.right);
	}

	public void preOrderTraversal(Node n) {
		System.out.print(n.data + " ");
		if(n.left != null)
			preOrderTraversal(n.left);
		if(n.right!=null)
			preOrderTraversal(n.right);
	}

	public void postOrderTraversal(Node n) {
		if(n.left != null)
			postOrderTraversal(n.left);
		if(n.right!=null)
			postOrderTraversal(n.right);
		System.out.print(n.data + " ");

	}

	public void search(Node n, int s){
		if(n.data == s) {
			System.out.println("A node with value :" + s + " is Present");
			return;
		} else if(s < n.data) {
			if(n.left != null) {
				search(n.left,s);
			}
			else {
				System.out.println("A node with value :" + s + " is NOT Present");
				return;
			}
		} else if(s > n.data) {
			if(n.right != null) {
				search(n.right, s);
			} else {
				System.out.println("A node with value :" + s + " is NOT Present");
				return;
			}
		}
	}

	public void deleteInterface(Node r, int s) {

		if(s < r.data) {
			delete(r,null,1,s);
		} else if(s >= r.data) {
			delete(r,null,2,s);
		}
	}

	public void delete(Node current, Node parent, int side ,int s) {

		if(current == null) { 
			System.out.println("No elem present");
			return;
		}

		if(s < current.data) {
			if(current.left != null) {
				delete(current.left,current,1,s);
			} else { 
				System.out.println("\nThe element with value:" + s + " is not present");
				return;
			}
		} else if( s > current.data) {
			if(current.right != null) {
				delete(current.right,current,2, s);
			} else { 
				System.out.println("\nThe element with value:" + s + " is not present");
				return;
			}
		} else {
			if(side == 2) {
				if(current.left != null && current.right != null) {
					solvetwochidlren(current, 2);
				} else if(current.left==null && current.right != null) {
					parent.right = current.right;
				} else if(current.right==null && current.left != null) {
					parent.right = current.left;
				} else if(current.right == null && current.left == null) {
					parent.right = null;
				}
			}
			if (side == 1) {
				if(current.left != null && current.right != null) {
					solvetwochidlren(current, 1);
				} else if(current.left==null && current.right != null) {
					parent.left = current.right;
				} else if(current.right==null && current.left != null) {
					parent.left = current.left;
				} else if(current.right == null && current.left == null) {
					parent.left = null;
				}
			}
		}
	}


	private void solvetwochidlren(Node current, int i) {

		Node prev = null;
		//		if ( i == 2) {
		Node right = current.right;
		prev = current;
		while(right.left!= null) {
			prev = right;
			right = right.left;
		}
		//System.out.println("KKKKK: " + current.data + "  " + current.left.data +  "  " + current.right.data);
		current.data = right.data;
		if(prev != current)
			prev.left = null;
		else
			prev.right = null;
		/*			
		} else if ( i == 1) {
			Node right = current.right;
			prev = current;
			while(right.left!= null) {
				prev = right;
				right = right.left;
			}

			current.data = right.data;
			prev.left = null;
		}
		 */		
	}

	public void minvalue(Node p, Node c) {
		Node par = p;
		Node child = c;
		while(child.left != null) {
			par = child;
			child = child.left;
		}
		par.left = child.right;
		p.data = child.data;
	}



	public int isPresent(Node n, int val) {
		Node root = n;
		if(n.data == val) {
			return 1;
		} else if(val < n.data) {
			if(n.left != null) {
				return isPresent(n.left,val);
			}
			else {
				return 0;
			}
		} else if(val > n.data) {
			if(n.right != null) {
				return isPresent(n.right, val);
			} else {
				return 0;
			}
		}
		return -1;
	}
}