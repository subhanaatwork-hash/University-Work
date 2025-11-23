import java.util.Scanner;
	public class Lab6Act2{
		public static void main(String []args ){
			Scanner sc = new Scanner(System.in);

			int limit, number, sum, counter;
			
			System.out.println("Enter the number of" + "integars in the list:");
			limit = sc.nextInt();
		
			System.out.println();
			sum = 0;
			counter = 0;
			System.out.println("Enter" + limit  + "integars");
			while (counter< limit){
				number = sc.nextInt();
				sum = sum + number;
				counter ++;

			}
			System.out.printf("The sum of the %d " + " numbers = %d%n ", limit, sum);
			
			if (counter != 0)
				System.out.printf("The average = %d%n" , (sum/ counter));
			else 
				System.out.println("No Input.");
			}
}

			