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

		DecoratorPatternDemo d = new DecoratorPatternDemo();
		d.main();
		A.main();
	}
	
	public static void main() {
		System.out.println("Main with no arguments");
	}
	
	public int localmem() {
		final int a = 0;
		return a;
	}
}


class A{
	public static void main(){
		
		System.out.println("abc");
	}
}