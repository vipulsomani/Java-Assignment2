package object.manipulation;

public class Rectangle {
	private float length;
	private float breadth;
	public Rectangle(float length, float breadth) {
		super();
		this.length= length;
		this.breadth= breadth;
	}
	public float getAreaOfRectangle() {
		return(this.breadth * this.length);
	}
	public float grtPerimeterOfRectangle() {
		return(2*(this.length + this.breadth));
	}
	public boolean hasSameArea(Rectangle rectangle2) {
		if(this.getAreaOfRectangle() == rectangle2.getAreaOfRectangle())
			return true;
		return false;
	}
}
