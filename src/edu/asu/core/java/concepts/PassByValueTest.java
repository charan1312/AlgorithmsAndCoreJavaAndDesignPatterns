package edu.asu.core.java.concepts;

class A {
	public int a;
	public A(int a) {
		this.a = a;
	}
	public A(){
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A VALUE:" + a;
	}
}
public class PassByValueTest {

	private int y;
	private A objA;

	public PassByValueTest() {
	
		objA = new A();
	}
	
	public A getObjA() {
		return objA;
	}

	public void setObjA(int val) {
		this.objA = new A(val);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public static void main(String[] args) {
		int m = 10;
		PassByValueTest pt = new PassByValueTest();
		pt.setObjA(8);
		pt.setY(9);
		System.out.println("BEFORE");
		System.out.println(pt.getObjA());
		System.out.println(pt.y);
		System.out.println(m);
		changeValues(pt,m);
		System.out.println("AFTER");
		System.out.println(pt.getObjA());
		System.out.println(pt.y);
		System.out.println(m);
		
		System.out.println(System.currentTimeMillis());
		
		
	}
	
	public static void changeValues(PassByValueTest p,int m) {
		p.objA.a = 18;
		p.y = 19;

		p = new PassByValueTest();
		p.objA.a = 88;
		p.y = 99;
		m = m + 99;
	}
}
