package edu.asu.foa.algo.design.patterns;

public class ShapeFactory {

	public Shape makeShape(String shapeType) {

		if(shapeType == null){
			return null;
		}		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();

		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();

		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		
		} else if(shapeType.equalsIgnoreCase("BIG CIRCLE")){
			return new BigCircle();
		}

		return null;
	}
}
