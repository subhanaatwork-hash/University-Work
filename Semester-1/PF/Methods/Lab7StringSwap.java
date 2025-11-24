import java.util.Scanner;
	public class Lab7StringSwap{
		public static void main (String [] args ){

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a string:");
		String str = sc.nextLine();

	        int spaceIndex = str.indexOf(" ");

                // Extract first and second words

               String firstWord = str.substring(0, spaceIndex);
               String secondWord = str.substring(spaceIndex + 1);

        	// Print swapped words
       		 System.out.println(secondWord + " " + firstWord);
   		 }
		}
