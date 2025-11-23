import java.util.Scanner;
	public class Lab6Task5{
		public static void main( String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sequence of integar numbers:");
		int num = sc.nextInt();

		int max = 0;
		while ((num = sc.nextInt()) !=0){
			if(num > max) {
			max = num;
			}
		}
		System.out.println("Maximum element:" + "=" + max);
		sc.close();

		}
}


		

