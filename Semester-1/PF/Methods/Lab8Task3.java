import java.util.Scanner;
	public class Lab8Task3{
		public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		double num1 = sc.nextDouble();

		System.out.println("Enter number 2:");
		double num2 = sc.nextDouble();

		System.out.println("Enter number 3:");
		double num3 = sc.nextDouble();

		displaySortedNumbers(num1, num2, num3);

		sc.close();	
		}

		public static void displaySortedNumbers(double num1, double num2, double num3){
		
		if(num1> num2){
		num1 = num2;
		}
		if(num2> num3){
		num2 = num3;
		}
		if(num3< num1){
		num3 = num1;
		}
		
		System.out.println(num1 + " < " + num2 + " < " + num3);
		}
	}
		

		