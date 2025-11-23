import java.util.*;

public class Apples{
	public static void main ( String [] args){
	Scanner scanner = new Scanner( System.in);

	System.out.println("Enter the N number of students: ");
	int students = scanner.nextInt();

	System.out.println("Enter the K number of apples each student has: ");
	int apples = scanner.nextInt();

	int dividedApples = (apples / students);
	int leftoverApples = (apples % students);
	

        System.out.println("Each student has:" + dividedApples);
	System.out.println("Remaining apples are:" + leftoverApples);

	
	scanner.close();

	}
}






        

