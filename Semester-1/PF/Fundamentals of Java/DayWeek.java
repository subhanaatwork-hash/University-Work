import java.util.Scanner;
	public class DayWeek{
	public static void main(String [] args){
                 
	Scanner input = new Scanner(System.in);
		
	System.out.print( "Enter a number between 1 and 7: ");
	int number = input.nextInt();
	
		switch(number){
			case 1 : System.out.println("MONDAY"); break;
			case 2 : System.out.println("TUESDAY"); break;
			case 3 : System.out.println("WEDNESDAY"); break;
			case 4 : System.out.println("THURSDAY"); break;
			case 5 : System.out.println("FRIDAY"); break;
			case 6 : System.out.println("SATURDAY"); break;
			case 7 : System.out.println("SUNDAY"); break;
			default : System.out.println("INVALID INPUT"); 
			}

		input.close();
		

		}
}

