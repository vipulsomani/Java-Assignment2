
public class Television {

	private String company;
	private String type;
	private boolean is3D;
	private double price;

	public Television(String company, String type, boolean is3D, double price) {

		this.company = company;
		this.is3D = is3D;
		this.price = price;
		this.type = type;
	}
	@Override
	public boolean equals(Object o1) {
		if(o1 != null && this !=null) {
			if(  ((Television) o1).getCompany() == this.getCompany() &&
					((Television) o1).getPrice() == this.getPrice())
			return true;
		}
		return false;	
	}
	@Override
	 public int hashCode(){

	        return type.hashCode() ^company.hashCode();
	    }
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public boolean is3D() {
		return is3D;
	}
	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}

}
