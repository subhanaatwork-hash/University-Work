import java.util.Scanner;
	public class Lab8Task1b{
		public static void main (String [] args){

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a integer:");
		int number = sc.nextInt();

		System.out.println("The reversed version of the entered integer is = " );
		
		reverse( number);

		sc.close();
		}

		public static void reverse(int number){

		int digit = 0;
		int reverse = 0;

		while (number != 0) {
            	 digit = number % 10;   
           	 reverse = (reverse * 10) + digit;	         
           	 number = number / 10; 
		}
		
		System.out.println(reverse);
}
}