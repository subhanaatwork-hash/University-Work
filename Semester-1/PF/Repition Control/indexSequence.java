import java.util.Scanner;

public class indexSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

	int index = 0;
	int maxIndex = 0;
	int maxValue;

	System.out.println("Enter numbers (end with 0):");

		while(true){
		
			int num = sc.nextInt();

			if(num ==0){ // Stop reading numbers when 0 is entered
			break;
			}

			index++;

			if(num > maxValue){
			maxIndex = index;
			maxValue = num;

			}
		}
		
				if(index == 0){
				System.out.println("No numbers entered.");
				}

				else{
				System.out.println("The index of the maximum value is:" + maxIndex);
				}
	}
}
    



	
	