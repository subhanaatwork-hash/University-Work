import java.util.Scanner;
	public class Lab8Task5{
		public static void main(String [] srgs){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String s = sc.nextLine();

		System.out.println("The number of letters in given String are: " + countLetters(s));

		sc.close();
		}
		
		public static int countLetters(String s){
	
		int countLetters = 0;
		int i =0;

		while( i< s.length()){
		
		countLetters++;
		i++;
		}
		return countLetters;
		}
	}