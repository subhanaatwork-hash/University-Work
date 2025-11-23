import java.util.*;

public class Desks{
	public static void main ( String [] args){
	Scanner scanner = new Scanner( System.in);

	System.out.println("Enter number of students in a: ");
	int a = scanner.nextInt();

	System.out.println("Enter the numbers of students in b: ");
	int b = scanner.nextInt();

	System.out.println("Enter number of students in c: ");
	int c = scanner.nextInt();

	int totalDesks = (int) ((a+1)/ 2) + (int) ((b+1) /2) + (int) ((c+1) /2);
	System.out.println("Total desks required: " + totalDesks);

       	scanner.close();
	}
}

