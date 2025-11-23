import java.util.Scanner;
	public class Lab6Act3{
		static Scanner input = new Scanner(System.in);
		static final int SENTINAL = -999;
		public static void main(String []args ){
			int number;
			int sum = 0;
			int count = 0;
			System.out.println("Enter positive integars" + "ending with" + SENTINAL);

			number = input.nextInt();
			while(number != SENTINAL)
			{
				sum =+ number;
				count++;
				number = input.nextInt();
				}
				System.out.printf("The sum of %d " + "numbers = %d%n" , count , sum);

			if(count != 0)
			System.out.printf("The average = %d%n" , (sum/count));
			else
			System.out.println("No input.);
			}
}
			
