package edu.asu.core.java.concepts;

public class ColoredCircle implements Cloneable {

    private int centerX;
    private int centerY;
	private Color color;

	public ColoredCircle(int x, int y, Color c){
	    this.centerX = x;	
		this.centerY = y;
		this.color = c;
	}

    public Object clone() {
        try {
            return (ColoredCircle)super.clone();
        }
        catch (CloneNotSupportedException e) {
        	return null;
        }
    }

	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColoredCircle [centerX=" + centerX + ", centerY=" + centerY
				+ ", color=" + color + "]";
	}

	
}

