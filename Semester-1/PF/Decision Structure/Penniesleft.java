import java.util.*;

public class Penniesleft{
public static void main(String [] args){
	Scanner input = new Scanner( System.in);
	System.out.print("Enter the amount as a decimal number: ");

	double decimalNumber = input.nextDouble();


	int totalCents = (int)(decimalNumber * 100);

        int dollars = totalCents / 100;
        totalCents = totalCents % 100;
	
        int quarters = totalCents / 25;
        totalCents = totalCents % 25;

        int dimes = totalCents / 10;
        totalCents = totalCents % 10;

        int nickels = totalCents / 5;
        totalCents = totalCents % 5;

        int pennies = totalCents;

       
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

	scanner.close();
	}
}



        

	



	

