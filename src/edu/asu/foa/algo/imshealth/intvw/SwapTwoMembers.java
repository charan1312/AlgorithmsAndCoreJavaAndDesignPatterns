package edu.asu.foa.algo.imshealth.intvw;

public class SwapTwoMembers {

	private int a ;
	private int b;

	public SwapTwoMembers(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	
	static <E> void swap( E a, E b) {
		
		System.out.println("BEFORE");
		System.out.println(a);
		System.out.println(b);
		E temp = a;
		a = b;
		b = temp;
		System.out.println("AFTER");
		System.out.println(a);
		System.out.println(b);
	}
	
	static <E> void swap1( E a, E b) {
		
		System.out.println("BEFORE");
		System.out.println(a);
		System.out.println(b);
		E temp = a;
		a = b;
		b = temp;
		System.out.println("AFTER");
		System.out.println(a);
		System.out.println(b);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[ A:" + a + "-B:" + b + " ]";
	}
	
	public static void main(String[] args) {
		
		SwapTwoMembers m1 = new SwapTwoMembers(10, 20);
		System.out.println(m1);
		
		SwapTwoMembers m2 = new SwapTwoMembers(99, 66);
		System.out.println(m2);

		swap(m1, m2);
		
		System.out.println(m2.a + "___" +m2.b);
	}
	
}
