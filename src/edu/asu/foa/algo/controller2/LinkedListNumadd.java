package edu.asu.foa.algo.controller2;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public class LinkedListNumadd {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder b = new StringBuilder();
        //if(l1.next == null)
        //	s1.append(l1.val);
        
        while(l1.next != null) {
            s1.append(l1.val);
            l1=l1.next;
        }
        s1.append(l1.val);
        
        System.out.println("After frst while:" +s1.toString());
        int A,B,C;
        StringBuilder a = s1.reverse();
        try {
        	A = Integer.parseInt(a.toString());
        }catch(NumberFormatException e) {
        	A = 0;
        }
        System.out.println("INT A: "+ A);
        
        //if(l2.next == null)
        //	s2.append(l2.val);
        while(l2.next != null) {
            s2.append(l2.val);
            l2=l2.next;
        }
        s2.append(l2.val);
        System.out.println("After scnd while:" +s2.toString());
        try{
            b = s2.reverse();
        } catch(NullPointerException e) {

        }
        try{
            B = Integer.parseInt(b.toString());
        } catch(NumberFormatException e) {
            B = 0;
        }
        //s = null;
        System.out.println("INT B: "+ B);
        
        C = A + B ;
        String chk = Integer.toString(C);
        int chkv = chk.length();
        
        System.out.println("INT C: "+ C);
        ListNode ans = null;
        
        if(C==0) {
        	ans =  new ListNode(C);
        }
        int Temp = C, cnt = 0;
        while(chkv!=0) {
        	int a1 = Temp % 10;
        	ListNode x = new ListNode(a1);
        	cnt++;
        	if(cnt==1)
        		ans = x;
        	else { 
        		while(ans.next != null) 
        			ans  = ans.next;
        		ans.next = x;
        	}
        	Temp = Temp / 10;
        	chkv--;
        }
        
//        String c = Integer.toString(C);
//        System.out.println("c is :" +c);
//        
//        System.out.println(c.charAt(c.length() - 1));
//        
//        ListNode head = new ListNode(c.charAt(c.length() - 1));
//        for(int i = c.length() - 2 ; i >= 0 ; i-- ) {
//            ListNode x = new ListNode(c.charAt(i));
//            //l3.val = i;
//            ListNode temp = head;
//            while(temp.next!=null)
//            	temp = temp.next;
//            temp.next = x;
//        }
//        
        return ans;
    }
    
    
    public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode a2 = new ListNode(8);
		a.next = a2;
		ListNode b = new ListNode(0);
		LinkedListNumadd l = new LinkedListNumadd();
		ListNode c = l.addTwoNumbers(a, b);
		
		System.out.println(c.val);
	}
}