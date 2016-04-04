package edu.asu.foa.algo.controller;

class Parent{  
	  void msg()throws ArithmeticException{System.out.println("parent");}  
	}  
	  
	class TestExceptionChild2 extends Parent{  
	  void msg()throws ArithmeticException{System.out.println("child");}  
	  
	  public static void main(String args[]){  
	   Parent p=new TestExceptionChild2();  
	   try{  
	   p.msg();  
	   }catch(Exception e){}  
	  }  
	}  