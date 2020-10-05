package object.manipulation;

public class Distance {

	int feet;
	float inches;

	public Distance() {

	}

	public Distance(int feet, float inches) {
		super();
		this.feet = feet;
		this.inches = inches;
	}

	public void set(int feet, float inches) {
		this.feet = feet;
		this.inches = inches;
	}


	public int getFeet() {
		return feet;
	}

	public float getInches() {
		return inches;
	}

	Distance add(Distance d1, Distance d2) {
		Distance d3 = new Distance();

		d3.inches = d1.inches + d2.inches;
		d3.feet = d1.feet + d2.feet + (int) (d3.inches / 12);
		d3.inches = (d3.inches % 12);
		return d3;
	}

	public void display(Distance d1, Distance d2, Distance d3) {
		System.out.println("1st distance : " + d1.feet + " feet " + d1.inches + " inches ");
		System.out.println("2nd distance : " + d2.feet + " feet " + d2.inches + " inches");
		System.out.println("Sum of distance : " + d3.feet + " feet " + d3.inches + " inches");
	}

}
