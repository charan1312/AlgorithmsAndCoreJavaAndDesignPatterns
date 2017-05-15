package edu.asu.foa.algo.amazon.seattle.telephonic;

//Java program to convert binary tree to double linked list

//A binary tree node
class Node1 {

 int data;
 Node1 left, right;

 Node1(int item) {
     data = item;
     left = right = null;
 }
}

public class BinaryTree2DLL {

 static Node1 root;
 /* This is the core function to convert Tree to list. This function follows
  steps 1 and 2 of the above algorithm */

 Node1 bintree2listUtil(Node1 node) {
      
	 System.out.println("SENT NODE:" + node.data);
     // Base case
     if (node == null) {
         return node;
     }
     
     // Convert the left subtree and link to root
     if (node.left != null) {
          
         // Convert the left subtree
         Node1 left = bintree2listUtil(node.left);

         // Find inorder predecessor. After this loop, left
         // will point to the inorder predecessor
         for (; left.right != null; left = left.right);

         // Make root as next of the predecessor
         System.out.println("LEFT SIDE, Node:" + node.data + " -- left:" + left.data);
         left.right = node;

         // Make predecssor as previous of root
         node.left = left;
     }

     // Convert the right subtree and link to root
     if (node.right != null) {
          
         // Convert the right subtree
         Node1 right = bintree2listUtil(node.right);

         // Find inorder successor. After this loop, right
         // will point to the inorder successor
         for (; right.left != null; right = right.left);

         // Make root as previous of successor
         System.out.println("RIGHT SIDE, Node:" + node.data + " -- right:" + right.data);
         right.left = node;

         // Make successor as next of root
         node.right = right;
     }

     System.out.println("Returning Node:" + node.data);
     return node;
 }

 // The main function that first calls bintree2listUtil(), then follows step 3 
 //  of the above algorithm
  
 Node1 bintree2list(Node1 node) {
      
     // Base case
     if (node == null) {
         return node;
     }

     // Convert to DLL using bintree2listUtil()
     node = bintree2listUtil(node);

     // bintree2listUtil() returns root node of the converted
     // DLL.  We need pointer to the leftmost node which is
     // head of the constructed DLL, so move to the leftmost node
     while (node.left != null) {
         node = node.left;
     }

     return node;
 }

 /* Function to print nodes in a given doubly linked list */
 void printList(Node1 node) {
     while (node != null) {
         System.out.print(node.data + " ");
         node = node.right;
     }
 }

 /* Driver program to test above functions*/
 public static void main(String[] args) {

     BinaryTree2DLL tree = new BinaryTree2DLL();

     // Let us create the tree shown in above diagram
     tree.root = new Node1(10);
     tree.root.left = new Node1(12);
     tree.root.right = new Node1(15);
     tree.root.left.left = new Node1(25);
     tree.root.left.right = new Node1(30);
     tree.root.right.left = new Node1(36);

     // Convert to DLL
     Node1 head = tree.bintree2list(root);

     // Print the converted list
     tree.printList(head);
 }
}