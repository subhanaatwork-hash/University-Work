
import java.util.Scanner;
	
	public class Magic{
		public static void main(String [] args ){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter month in numeric form (1-12):");
		int month = input.nextInt();

		System.out.println("Enter a day (1-31):");
		int day = input.nextInt();

		System.out.println("Enter a year in two-digits i.e 60 for 1960:");
		int year = input.nextInt();

		if(month * day == year ){
		System.out.println("DATE IS MAGIC!");
		}

		else{
		System.out.println("DATE IS NOT MAGIC");
		}

		input.close();

		}
}