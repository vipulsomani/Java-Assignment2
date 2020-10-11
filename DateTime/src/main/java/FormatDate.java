import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatDate {
public static void main(String[] args){
		
		try {
					
			Scanner sc=new Scanner(System.in);
			System.out.print("/Enter Date in 8 digits (ddmmyyyy) format: ");
			String dt=sc.nextLine();
			if(dt.length()!=8) {
				throw new Exception("Plzzz Enter Valid date");
			}
			String datee=""+dt.charAt(0)+dt.charAt(1)+"/"+dt.charAt(2)+dt.charAt(3)+"/"+dt.charAt(4)+dt.charAt(5)+dt.charAt(6)+dt.charAt(7);
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate date=LocalDate.parse(datee.trim(),formatter);
			System.out.println("Date in dd/mm/yyyy format = "+datee);
			if(date.getDayOfMonth()>10)
				System.out.println("Date in dd, month name, yyyy format = "+date.getDayOfMonth()+" "+date.getMonth()+", "+date.getYear());
			else
				System.out.println("Date in dd, month name, yyyy format = "+"0"+date.getDayOfMonth()+" "+date.getMonth()+", "+date.getYear()); 
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}

}
}
