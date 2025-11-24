import java.util.*;
	public class Lab7Task5b{
		public static void main (String [] args){
		Scanner sc = new Scanner(System.in);

		//Part b

		System.out.println("Enter a hex digit: ");
		String hex = sc.nextLine().toUpperCase();

		int decimal = Integer.parseInt(hex,16);
		String binary = Integer.toBinaryString(decimal);

		System.out.println("Binary: " + binary);

		}
}
		

		

		

		
		
	
	