package employeee_assignment;

public class Employee {

	private int Id;
	private String name;
	private int monthlyBasic;
	
	private double pf;
	private int professionalTax;
	private double esic;
	
	static int medicalAllowance = 1250;
	private static int conveynceAllownce = 800;
	
	public Employee(int Id, String name, int monthlyBasic) {
		this.Id = Id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}
	public double getPf() {
		pf=6500;
		if((.10*monthlyBasic)<pf)
			pf=.10*monthlyBasic;
		return pf;
	}
	public int getProfessionalTax() {
		professionalTax=100;
		if(getMonthlyGrossSalary()<=10000)
			professionalTax=50;
		return professionalTax;
	}
	public double getEsic() {
		esic=0;
		if(monthlyBasic<=5000)
			esic=.475*monthlyBasic;
		return esic;
	}

	public int getAnnualBasic() {
		int annualBasic = 12 * monthlyBasic;
		return annualBasic;
	}
	public int getMonthlyGrossSalary() {
		int monthlyGrossSalary = monthlyBasic + (monthlyBasic/2) + medicalAllowance + conveynceAllownce;
		return monthlyGrossSalary;
	}
	
	public int getAnnualGrossSalary() {
		int annualGrossSalary= 12 * getMonthlyGrossSalary();
		return annualGrossSalary;
	}
	public double getMonthlyDeductions() {
		return(getPf()+getEsic()+getProfessionalTax());
	}
	public double getMonthlyTakeHome() {
		double monthlyTakeHome= getMonthlyGrossSalary() - getMonthlyDeductions();
		return monthlyTakeHome;
	}
	public double getAnnualTakeHome() {
		double annualTakeHome = 12 * getMonthlyTakeHome();
		return annualTakeHome;
	}

	public float setPFRate(float f) {
		return f;
	}
	
	public float getPFRate() {
		float PFRate = (10*monthlyBasic/100);
		return PFRate;
	}
	

}
