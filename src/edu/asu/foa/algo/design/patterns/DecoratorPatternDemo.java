package edu.asu.foa.algo.design.patterns;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		IPony pony = new Pony();
		
		IUnicorn unicorn = new Unicorn(pony);
		unicorn.ride();
		System.out.println();
		
		Isaddle saddle = new Saddle(unicorn);
		saddle.ride();
		System.out.println();
		
		Isaddle saddle1 = new Saddle(pony);      // CHANGE THE SADDLE INTERFACE TO EXTEND IPONY INSTEAD OF ISADDLE
		saddle1.ride();

		A.main1();
	}
	
	public int localmem() {
		final int a = 0;
		return a;
	}
}


class A{
	public static void main1 (){
		
		System.out.println("abc");
	}
}