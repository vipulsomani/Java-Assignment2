import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<Laptop> laptop = new HashSet<Laptop>();
		Laptop l1 = new Laptop("Lenovo", "yoga", "Windows", "Core i5");
		Laptop l2 = new Laptop("Dell", "inpiron", "Windows", "Core i5");
		Laptop l3 = new Laptop("Apple", "macbook", "ios", "Core i5");
		Laptop l4 = new Laptop("Apple", "macbook", "ios", "Core i5");

		laptop.add(l1);
		laptop.add(l2);
		laptop.add(l3);
		laptop.add(l4);

		Car c1 = new Car("Tesla", "Model S", 2020, 85000);
		Car c2 = new Car("Renault", "Duster", 2014, 50000);
		Car c3 = new Car("Tata", "Altorz", 2020, 45000);
		Car c4 = new Car("Tata", "Nano", 2020, 45000);

		Set<Car> cars = new HashSet<>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		
		Television tv1=new Television("Samsung","LED",true,50000); 
		Television tv2=new Television("LG","LCD",false,20000);
		Television tv3=new Television("Onida","Plasma",true,1000);
		Television tv4=new Television("LG","LED",true,20000);
		Television tv5=new Television("LG","LCD",false,20000);
		
		Set<Television> televisions=new HashSet<Television>();  
		televisions.add(tv1);
		televisions.add(tv2);
		televisions.add(tv3);
		televisions.add(tv4);
		televisions.add(tv5);
		
		CellPhone cell1 = new CellPhone("Moto","G5+","12MP","Android 8",17000);
		CellPhone cell2 = new CellPhone("Apple","Iphone X","7 MP","ios 11",40000);
		CellPhone cell3 = new CellPhone("Redmi","Note 5","44 MP","Android 10",15000);
		
		Set<CellPhone> cellPhones = new HashSet<>();
		cellPhones.add(cell1);
		cellPhones.add(cell2);
		cellPhones.add(cell3);
		
		School s1=new School("DPS","Indore","Indore",1);
		School s2=new School("SES","Mandsaur","Mandsaur",2);
		School s3=new School("Convent","Mani","Mandsaur",3);
		Set<School> schools = new HashSet<>(); 
		schools.add(s1);
		schools.add(s2);
		schools.add(s3);
		
		
		System.out.println("Laptop");
		for (Laptop i : laptop) {
			System.out.println("Company: " + i.getCompany() + ", Model: " + i.getModel() + ", OS: "
					+ i.getOperatingSystem() + ", Processor: " + i.getProcessor());

		}
		System.out.println("CARS :");
		for (Car it : cars) {
			System.out.println("Manufacturer: " + it.getMake() + ", Model :" + it.getModel() + ", Year " + it.getYear()
					+ ", Price: " + it.getPrice());

		}
		System.out.println("TELEVISION");
		for(Television i:televisions) {                         
			System.out.println("Company: "+i.getCompany()+", Type: "+i.getType()+", Price "+i.getPrice()+", 3D Enabled: "+i.is3D());
			
		}
		System.out.println("CELLPHONE");
		for(CellPhone i:cellPhones) {                         
			System.out.println("Company: "+i.getCompany()+", Model: "+i.getModel()+", Description "+i.getDescription()+", OS: "+i.getOperatingSystem()+", Price "+i.getPrice() );
			
		}
		System.out.println("SCHOOLS :");
		for(School i:schools) {                             
			System.out.println("Name: "+i.getName()+", City: "+i.getCity()+", District: "+i.getSchooldistrict()+", Ranking: "+i.getGreatSchoolRanking());
			
		}
		Map<String, String> studentMap = new HashMap<String, String>();
		studentMap.put("Vipul", "Apple");
		studentMap.put("Yash", "Banana");
		studentMap.put("Stayen", "Grapes");
		
		for(Map.Entry<String, String> it : studentMap.entrySet()) {
			System.out.println(it.getKey()+" : "+it.getValue());
		}
	}
}
