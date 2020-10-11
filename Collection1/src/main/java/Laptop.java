
public class Laptop {

	private String company;
	private String model;
	private String operatingSystem;
	private String processor;

	public Laptop(String company, String model, String operatingSystem, String processor) {
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	public String getModel(){
		return model;
	}
	@Override
	public boolean equals(Object o1) {
		if(o1 != null && this !=null) {
			if(((Laptop) o1).getModel() == this.getModel())
			return true;
		}
		return false;	
	}
	@Override
	 public int hashCode(){

	        return company.hashCode() ^model.hashCode();
	    }
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
}
