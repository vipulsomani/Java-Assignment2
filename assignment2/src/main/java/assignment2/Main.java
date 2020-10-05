package assignment2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i;

		do {

			System.out.println("Enter" + "\n" + " 1 For Duplicate Assign." + "\n" + "2 For Likes Assign." + "\n"
					+ "3 For Highest Number Assign" + "\n" + "4 For ODD Appearance Assign" + "\n" + "5 to exit");
			i = scanner.nextInt();

			switch (i) {
			case 1: {
				System.out.println("Enter a string");
				String s = scanner.next();
				s=s.toLowerCase();
				char string[] = s.toCharArray(); 
				int n=string.length; 
				 NoOfDuplicates nd = new NoOfDuplicates();
				 int number = nd.countDuplicate(string, n);
				 System.out.println("Number of Duplicate characters = : "+number); 
				break;
			}
			case 2: {
				
				System.out.println("Enter number of people who likes");
				int n = scanner.nextInt();
				String[] like = new String[10];
				
				for(int j=0;j<n;j++)
				{
					like[j] = scanner.next();
				}
				Like l = new Like();
				String s = l.like(like,n);
				System.out.println(s); 
			}

			case 3: {
				System.out.println("Enter total number of digits ");
				int k = scanner.nextInt();
				System.out.println("Enter number ");
				int n = scanner.nextInt();
				HighestNumber h = new HighestNumber();
				int num = h.number(n,k);
				System.out.println("Highest possible number is "+ num);
				break;
			}

			case 4: {
				
				int arr[] = new int[]{ 1, 2, 3, 1, 2, 3, 4, 4, 4, 2, 4, 4, 2 }; 
		        int n = arr.length; 
		        OddApearance o = new OddApearance();
		        int odd = o.oddApearance(arr, n);
		        System.out.println("Number appear odd times " + odd);
				break;
			}


			default: {

				break;
			}

			}

		} while (i != 5);
		scanner.close();
	}

}
