
import java.util.Scanner;
	public class Lab8Task6{
		public static void main (String [] args){

		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter n : ");
		int n = sc.nextInt();

		printMatrix(n);
		
		sc.close();
		}
		
		public static void printMatrix(int n) {
        		for (int i = 0; i < n; i++) {          
            			for (int j = 0; j < n; j++) {        
                			int randomBit = (int) (Math.random() * 2); // 0 or 1
                			System.out.print(randomBit + " ");
            				}
            				System.out.println();

					}
		}
}

