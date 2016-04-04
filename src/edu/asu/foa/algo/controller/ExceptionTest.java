package edu.asu.foa.algo.controller;

import java.io.IOException;

public class ExceptionTest {

	
	static void validateAge(int n) {
		
		try{
			if (n<18) 
				throw new ArithmeticException("Age not valid");
			else
				System.out.println("Welcome to vote");
		} catch(ArithmeticException e) {
			System.out.println("Caught in ValidateAge Method:" + e);
		}
	}
	
	
//	public static void main(String[] args) {
		
/*		int a = 0;
//		int b = 100 / a;
		try{
			int c = 100/a;
		} catch (ArithmeticException ae) {
			System.out.println("A value:" +a);
			System.out.println(ae);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("After try catch block");
*/
		
/*		try {
			try {
				System.out.println("Going to divide");
				int b=39/0;
			} catch (ArithmeticException e){
				System.out.println(e);
			}
			
			try{
				int a[] = new int[5];
				a[5] = 4;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
*/		

/*		try{
			validateAge(4);
		} catch(ArithmeticException e) {
			System.out.println("CAught in main method:" + e);
		}
*/
		
	
/*	
	
//By Default, CHECKED EXCEPTIONS ARE NOT PROPAGATED	
		 void m() {
	//		 throw new java.io.IOException("device error");//checked exception
			 throw new ArithmeticException("Unchecked Exception");
		 }  
		
		 void n(){  
			 m();  
		 }  
		 void p(){  
			 try{  
				 	n();  
			 } catch(Exception e) {
				 System.out.println("exception handled in Method p");
			 }  
		 }  
		
		 public static void main(String args[]){  
			 ExceptionTest obj=new ExceptionTest();  
			   obj.p();  
			   System.out.println("normal flow");  
			  }  
		 
*/		 
		 
		 
// CHECKED EXCEPTIONS CAN BE PROPAGATED USING throws	
		 void m() throws IOException{
			 throw new java.io.IOException("device error");//checked exception
		 }  
		
		 void n() throws IOException{  
			 m();  
		 }  
		 void p(){  
			 try{  
				 	n();  
			 } catch(Exception e) {
				 System.out.println("exception handled in Method p");
			 }  
		 }  
		
		 public static void main(String args[]){  
			 ExceptionTest obj=new ExceptionTest();  
			   obj.p();   
			   System.out.println("normal flow");  
			  }
		 
		 
//		System.out.println("Normal Flow");
//	}
}
