package edu.asu.foa.algo.design.patterns;

public class FactoryPatternDemo {

	   public static void main(String[] args) {
		   
	      ShapeFactory shapeFactory = new ShapeFactory();

	      Shape shape = null;
	      
	      //get an object of Circle and call its draw method.
	      shape = shapeFactory.makeShape("CIRCLE");

	      callDraw(shape);	      
//	      //call draw method of Circle
//	      if(!(shape==null))
//	      shape.draw();

	      //get an object of Rectangle and call its draw method.
	      shape = shapeFactory.makeShape("RECTANGLE");
	      callDraw(shape);	      

	      //get an object of Square and call its draw method.
	      shape = shapeFactory.makeShape("SQUARE");
	      callDraw(shape);	      
	      
	      //get an object of Square and call its draw method.
	      shape = shapeFactory.makeShape("SQUARE1");
	      callDraw(shape);
	      
	      //get an object of Big Circle and call its draw method.
	      shape = shapeFactory.makeShape("BIG CIRCLE");
	      callDraw(shape);
	      
	   }
	   
	   public static void callDraw(Shape returnedShape) {
		      if(!(returnedShape==null))
		    	  returnedShape.draw();
		      else
		    	  System.out.println("Shape is not present");
	   }
	}