import java.util.Scanner;
	public class countZeros{
		public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of integars you want to input:");
		int N = sc.nextInt();

		int zeroCount = 0;

		System.out.println("Enter: " +  N  + " integers" );
		for ( int i = 0 ; i< N ; i++){
			int num = sc.nextInt();
			if(num == 0){
				zeroCount++;
			}
		}
		
		System.out.println("Number of zeros entered:"  + zeroCount);
		sc.close();
		}
}
		

		

		

		