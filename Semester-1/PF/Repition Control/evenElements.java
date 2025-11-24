import java.util.Scanner;

public class evenElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	 int count = 0;

	System.out.println("Enter a sequence with a number of even elements):");

	while(true){
	int sequence = sc.nextInt();
	
	if(sequence == 0 ){
	break;
	}

	if (sequence % 2 == 0){
	count++;
	}
	}

	System.out.println("The number of even elements is : " + count);

}
}
	
	

	

