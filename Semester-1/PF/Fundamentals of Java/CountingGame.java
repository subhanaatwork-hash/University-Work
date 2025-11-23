import java.util.Scanner;
	public class CountingGame{
		public static void main (String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of dimes:");
		int dimes = sc.nextInt();

		System.out.println("Enter the number of quarters:");
		int quarters = sc.nextInt();

		System.out.println("Enter the number of pennies:");
		int pennies = sc.nextInt();

		System.out.println("Enter the number of nickles:");
		int nickles = sc.nextInt();

		if(pennies * nickles * quarters * dimes == 100){
		System.out.println("Congratulations! You have WON the game.");
		}

		else if ( pennies * nickles * quarters * dimes > 100){
		System.out.println("The amount entered was more than one dollar");
		}

		else{
		System.out.println("The amount entered was less than one dollar");
		}

                sc.close();
 		}
	}



		