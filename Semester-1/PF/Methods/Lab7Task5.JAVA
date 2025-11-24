import java.util.*;
	public class Lab7Task5{
		public static void main (String [] args){
		Scanner sc = new Scanner(System.in);

		//Part a

		System.out.println("Enter a decimal value (0 to 15): ");
		int decimal = sc.nextInt();

		if( decimal <=9){
		System.out.println("The hex value is : " + decimal);
		}
		else if( decimal == 10){
		System.out.println("The hex value is : " + 'A');
		}
		else if (decimal == 11){
		System.out.println("The hex value is : " + 'B');
		}
		else if (decimal == 12){
		System.out.println("The hex value is : " + 'C');
		}
		else if (decimal == 13){
		System.out.println("The hex value is : " + 'D');
		}
		else if (decimal == 14){
		System.out.println("The hex value is : " + 'E');
		}
		else if (decimal == 15){
		System.out.println("The hex value is : " + 'F');
		}
		else
		{
		System.out.println(decimal + " is an invalid input");
		}

}
}