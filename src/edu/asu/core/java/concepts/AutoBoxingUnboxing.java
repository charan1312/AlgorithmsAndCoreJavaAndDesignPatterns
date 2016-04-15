package edu.asu.core.java.concepts;

public class AutoBoxingUnboxing {

	private static Integer counter = 0;
	
	public static void main(String[] args) {
		
		int a = 10;
		
		Integer iobj = new Integer("8");
		
		System.out.println(iobj.intValue());
		System.out.println(iobj.doubleValue());
		System.out.println(iobj.longValue());
		System.out.println(iobj.byteValue());
		System.out.println(iobj.shortValue());
		
		iobj  = Integer.valueOf("1000", 16);
		
		System.out.println(iobj.intValue());
		System.out.println(iobj.doubleValue());
		System.out.println(iobj.longValue());
		System.out.println(iobj.byteValue());
		System.out.println(iobj.shortValue());
		
        // Example 1: == comparison pure primitive – no autoboxing
        int i1 = 1;
        int i2 = 1;
        System.out.println("i1==i2 : " + (i1 == i2)); // true

        // Example 2: equality operator mixing object and primitive
        Integer num1 = 1; // autoboxing
        int num2 = 1;
        System.out.println("num1 == num2 : " + (num1 == num2)); // true

        // Example 3: special case - arises due to autoboxing in Java
        Integer obj1 = 127; // autoboxing will call Integer.valueOf()
        Integer obj2 = 129; // same call to Integer.valueOf() will return same
                            // cached Object  -- CACHING WILL HAPPEN BT -128 to 127

        System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // true

        // Example 4: equality operator - pure object comparison
        Integer one = new Integer(1); // no autoboxing
        Integer anotherOne = new Integer(1);
        System.out.println("one == anotherOne : " + (one == anotherOne)); // false
        
        if(counter <= 0) {
        	System.out.println("Less than r equal to zero");
        } else {
        	System.out.println("Greater than zero");
        }
    }

}
