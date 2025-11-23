import java.util.*;

	public class DigitalClock{
	public static void main(String [] args){
	Scanner input = new Scanner( System.in);
	System.out.print("Enter the time in minutes since midnight: ");
	int N = input.nextInt();

	int hours = ((N / 60)%24);
	int minutes = (N % 60);

	System.out.println(hours + "" + minutes);      //we put inverted commas here because othwerwise the compiler would just add hours and minute


	input.close();

	}
}
