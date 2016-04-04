package edu.asu.core.java.concepts;

public class Color {

    private String color;

    public Color(String c){
        this.color = c;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Color [color=" + color + "]";
	}
    
}