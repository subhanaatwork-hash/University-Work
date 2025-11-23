import java.util.Scanner;
	public class Lab6Task2{
		public static void main(String []args ){
			Scanner sc = new Scanner(System.in);

		       System.out.print("Enter the value of 'n':");
			int valueN = sc.nextInt();

			int factorialN = 1 * 2 * valueN;
			System.out.println("Factorial of n is:" + factorialN);

			sc.close();
		}
}

			