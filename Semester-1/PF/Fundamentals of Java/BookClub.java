import java.util.Scanner;
	public class BookClub {
		public static void main(String [] args ) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the number of books purchased (1-60):");
		int booksPurchased = input.nextInt();

		if (booksPurchased == 1) {
		System.out.println("YOU HAVE EARNED 5 POINTS");
		
		}else if (booksPurchased == 2) {
		System.out.println("YOU HAVE 15 POINTS");
		
		}else if (booksPurchased == 3) {
		System.out.println("YOU HAVE EARNED 50 POINTS");

		}else if (booksPurchased >= 4) {
		System.out.println("YOU HAVE EARNED 60 POINTS");

		}else {
		System.out.println("YOU HAVE EARNED 0 POINTS");
		}

		input.close();
		}
}

		
		