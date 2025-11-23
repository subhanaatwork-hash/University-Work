/*PSEUDOCODE:BEGIN
      DISPLAY "Enter years of service: "
    READ yearsOfService
 
    IF yearsOfService < 3 THEN
        DISPLAY "Not eligible for a bonus."
    ELSE
  
        DISPLAY "Enter performance rating (1, 2, or 3): "
        READ rating

  
        IF rating == 3 THEN
            DISPLAY "Bonus: $10,000"
        ELSE IF rating == 2 THEN
            DISPLAY "Bonus: $5,000"
        ELSE IF rating == 1 THEN
            DISPLAY "Bonus: $2,000"
        ELSE
            DISPLAY "Invalid rating! Please enter 1, 2, or 3."
        END IF
    END IF
END */
 
import java.util.Scanner;
	public class CheckingNumbers{
		public static void main(String [] args ){
			Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter a number:");
		int number = sc.nextInt();  //if we put it before system.out.print, it will wait for an input forever

	
		if (number>0){
		if (number%2 == 0){
			System.out.println("It is a positive and even number");
			}else{
			System.out.println("It is a positive and odd number");	
			}

		}else if(number<0){
		System.out.println("The number is negative");
		}else{
		System.out.println("The number is zero");
		}

		sc.close();
		}
	}


		
				
