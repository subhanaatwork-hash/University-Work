import java.util.Scanner;
public class lab7IndexFinder{
	public static void main (String [] args ){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: " );
		String str = sc.nextLine();

                int first = str.indexOf('f');      // first occurrence
        	int last = str.lastIndexOf('f');   // last occurrence

        	if (first == -1) {
           	 // Do not print anything if 'f' does not appear
       		 } 
        
		else if (first == last) {
            	System.out.println(first);       // Only one occurrence
        	}
        
		else {
            	System.out.println(first + " " + last);   // Two or more occurrences
        	}

    	}
}
