package edu.asu.core.java.concepts;

//public class TestOverrideFinalClass extends TestFinalOverrideFinalMeth{   // ERROR CANT extend THE FINAL CLASS
public class TestOverrideFinalClass {	
	

	public static void main(String[] args) {
		TestFinalKeyWord tfkw = new TestFinalKeyWord();
		TestFinalKeyWord tfkw2 ;
		System.out.println("Here-0");
		TestFinalOverrideFinalMeth tfofm;
		final TestFinalOverrideFinalMeth tfofm2 = new TestFinalOverrideFinalMeth();
		
		System.out.println("Here-1");
		tfkw2 = tfkw;
		System.out.println(tfkw.getVar1());
		System.out.println(tfkw2.getVar1());
		
		tfkw2.modifyVar1();
		System.out.println(tfkw.getVar1());
		System.out.println(tfkw2.getVar1());

		//System.out.println(tfofm.getChild());
		
		
		System.out.println(tfofm2.getChild());
		
		//tfofm2 = tfofm;  // cant assign a diff reference to the final object variable..it always points to the same reference
		tfofm = tfofm2;
		//tfofm2 = tfofm;
		
		System.out.println(tfofm.getChild());  
		
		tfofm.setChild(1000);       ////But the property of the objects can be changed
		System.out.println(tfofm2.getChild());
		System.out.println(tfofm.getChild());
	}
}
