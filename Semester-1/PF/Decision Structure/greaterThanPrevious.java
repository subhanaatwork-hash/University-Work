import java.util.Scanner;

public class greaterThanPrevious {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	int count = 0;

	System.out.println("Enter a number:");
	int previous = sc.nextInt();

	if( previous == 0){
	System.out.println("No numbers were entered:");
	}

	while(true){
	
	int current = sc.nextInt();
	
	if( current == 0){
	break;
	}
	
	if(current > previous){
	count++;
	}

	previous = current;
	}

	System.out.println("Number of elements greater than previous one:" + count);

	}
}



	
