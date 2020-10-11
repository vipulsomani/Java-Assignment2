
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	public Car(String make,String model,int year,double price) {
		this.make=make;
		this.model=model;
		this.price=price;
		this.year=year;
	}
	@Override
	public boolean equals(Object o1) {
		if(o1 != null && this !=null) {
			if(((Car) o1).getModel() == this.getModel())
			return true;
		}
		return false;	
	}
	@Override
	 public int hashCode(){

	        return make.hashCode() ^model.hashCode();
	    }
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
