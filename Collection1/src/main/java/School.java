
public class School {
	private String name;
	private String city;
	private String schooldistrict;
	private int greatSchoolRanking;	
		
	public School(String name, String city, String schooldistrict, int greatSchoolRanking) {
		this.city=city;
		this.name=name;
		this.schooldistrict=schooldistrict;
		this.greatSchoolRanking=greatSchoolRanking;
	}
	@Override
	public boolean equals(Object o1) {
		if(o1 != null && this !=null) {
			if(  ((School) o1).getName() == this.getName() &&
					((School) o1).getCity() == this.getCity() &&
						((School) o1).getSchooldistrict() == this.getSchooldistrict())
			
			return true;
		}
		return false;	
	}
	@Override
	 public int hashCode(){

	        return name.hashCode() ^schooldistrict.hashCode();
	    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchooldistrict() {
		return schooldistrict;
	}

	public void setSchooldistrict(String schooldistrict) {
		this.schooldistrict = schooldistrict;
	}

	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
}
