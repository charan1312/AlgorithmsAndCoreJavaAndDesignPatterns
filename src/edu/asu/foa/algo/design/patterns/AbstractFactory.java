package edu.asu.foa.algo.design.patterns;

public abstract class AbstractFactory {

	abstract Color getColor(String color);
	
	abstract Shape getShape(String shapeType);
	
}
