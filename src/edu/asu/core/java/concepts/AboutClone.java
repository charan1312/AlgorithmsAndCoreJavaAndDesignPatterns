package edu.asu.core.java.concepts;

public class AboutClone {

	public static void main(String[] args) {
		Color c1 = new Color("Red");
		ColoredCircle cir1 = new ColoredCircle(1, 1, c1);
		
		System.out.println(c1);
		System.out.println(cir1);

		cir1.getColor().setColor("BLACK");
		System.out.println(cir1);
		System.out.println(c1);

		ColoredCircle cir2 = (ColoredCircle) cir1.clone();
		System.out.println(cir2);
		
		cir2.setCenterX(3);
		cir2.setCenterY(55);
		cir2.getColor().setColor("PURPLE");
		
		System.out.println(cir2);
		System.out.println(cir1);
		System.out.println(c1);

	}
}
