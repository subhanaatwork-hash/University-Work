import java.util.Scanner;

public class Lab7Task3{
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String word = sc.nextLine();

	String reversed = "";
	
	for(int i = word.length() - 1; i >= 0; i--){
	reversed += word.charAt(i);
	}

	if(reversed.equalsIgnoreCase(word)){

	System.out.println( word +  " is a palindrome.");
	}
	else{
	System.out.println( word + " is not a palindrome.");
	}
}
}


	