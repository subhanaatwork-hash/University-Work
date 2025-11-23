import java.util.Scanner;

public class MinimumOfNumbers{
public static void main(String [] args ) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first number: ");
        int a = input.nextInt();
	System.out.print("Enter second number: ");
        int b = input.nextInt();
	System.out.println();
	if (a> b )
	System.out.println( "b is smaller");
	else 
	System.out.println( "a is smaller");

         //Sign caculator

	System.out.print("Enter an integer: ");
        int x = input.nextInt();
        
        if (x > 0) {
            System.out.println(1);
        } else if (x < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }

        
        //Minimum of three numbers
	System.out.print("Enter first number: ");
	int p = input.nextInt();  //can aslo write int a = input.nextInt
	System.out.print("Enter second number: ");
	int q = input.nextInt();
	System.out.print("Enter third number: ");
	int r = input.nextInt();
	System.out.println();
	
	int min = p;
	if (q< min ){
	min = q;
	}
	if ( r< min) {
	min = r;
	}

System.out.println("The minimum is: " + min);
        
        input.close();
    }
}
 
	

          

	

        


	  
