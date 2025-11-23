/*START

    DECLARE constant PRICE_PER_PACKAGE = 99.0

    PROMPT "Enter the number of packages purchased"
    READ packagesPurchased  ← integer input

    SET discountRate ← 0.0

    IF packagesPurchased >= 10 AND packagesPurchased <= 19 THEN
        discountRate ← 0.20
    ELSE IF packagesPurchased >= 20 AND packagesPurchased <= 49 THEN
        discountRate ← 0.30
    ELSE IF packagesPurchased >= 50 AND packagesPurchased <= 99 THEN
        discountRate ← 0.40
    ELSE IF packagesPurchased >= 100 THEN
        discountRate ← 0.50
    ELSE
        DISPLAY "INVALID INPUT"

    DISPLAY "Quantity Purchased: ", packagesPurchased

    CALCULATE totalBeforeDiscount ← packagesPurchased × PRICE_PER_PACKAGE
    DISPLAY "Total Before Discount: ", totalBeforeDiscount (formatted to 2 decimals)

    CALCULATE discountAmount ← totalBeforeDiscount × discountRate
    DISPLAY "Discount Applied: ", discountAmount (formatted to 2 decimals)

    CALCULATE totalAfterDiscount ← totalBeforeDiscount − discountAmount
    DISPLAY "Total After Discount: ", totalAfterDiscount (formatted to 2 decimals)

END
*/

import java.util.Scanner;
	public class discount{
		public static void main (String [] args ){
		Scanner input = new Scanner(System.in);

		final double PRICE_PER_PACKAGE = 99.0;

		System.out.print("Enter the number of packages purchased");
		int packagesPurchased = input.nextInt();

		double discountRate = 0.0;
		
		if( packagesPurchased >=10 && packagesPurchased <=19){
		discountRate = 0.20;
		}

		else if( packagesPurchased >= 20 && packagesPurchased <=49){
		discountRate = 0.30;
		}

		else if( packagesPurchased >=50 && packagesPurchased <=99){
		discountRate = 0.40;
		}

		else if( packagesPurchased >= 100){
		discountRate = 0.50;
		}

		else{
		System.out.println("INVALID INPUT");
		}

		System.out.printf("Quantity Purchased: %d%n", packagesPurchased);

		double totalBeforeDiscount;	
		double totalAfterDiscount;
		double discountAmount;
		
		totalBeforeDiscount = packagesPurchased * PRICE_PER_PACKAGE;
		System.out.printf("Total Before Discount: $%.2f%n", totalBeforeDiscount);

		discountAmount = totalBeforeDiscount * discountRate;
		System.out.printf("Discount Applied: $%.2f%n", discountAmount);

		totalAfterDiscount = totalBeforeDiscount - discountAmount;
		System.out.printf("Total After Discount: $%.2f%n", totalAfterDiscount);



		input.close();
		}
}
		

