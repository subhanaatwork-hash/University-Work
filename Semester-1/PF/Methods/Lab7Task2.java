import java.util.*;
	public class Lab7Task2{
		public static void main (String [] args){
		Scanner sc = new Scanner(System.in);

		//Part a

		System.out.println("Enter an ASCII code:");
		int code = sc.nextInt();

		codeConvertor(code);

		//Part b

		System.out.println("\n Enter a character:");
		char ch = sc.next().charAt(0); // read first character of input
        	int unicode = (int) ch;

        	System.out.println("The Unicode for the character " + ch + " is " + unicode);

        	sc.close();
		
}

		public static char codeConvertor( int code){
		
		if (code < 0 || code > 127) {
                System.out.println("Invalid input! ASCII codes must be between 0 and 127.");
                } else {
                char character = (char) code;
                System.out.println("The character for ASCII code " + code + " is " + character);
                }
		return (char) code;
    }
}

		
		
		