import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyAge {

		public static void main(String[] args) throws Exception{
			System.out.print("Enter date: ");
			
			 Scanner sc=new Scanner(System.in);
			 String dt=sc.nextLine();
			 String datee=""+dt.charAt(0)+dt.charAt(1)+"/"+dt.charAt(2)+dt.charAt(3)+"/"+dt.charAt(4)+dt.charAt(5)+dt.charAt(6)+dt.charAt(7);
			 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/mm/yyyy");
			 LocalDate date=LocalDate.parse(datee.trim(),formatter);
			 
			 Period period=Period.between(date, LocalDate.now());
			 System.out.print("You lived "+period.getYears()+" years, "+period.getMonths()+" months and "+period.getDays()+" days");	}


	}
