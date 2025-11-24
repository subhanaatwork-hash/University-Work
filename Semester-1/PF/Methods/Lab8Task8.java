import java.util.Scanner;
	public class Lab8Task8{
		public static void main(String [] srgs){

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String s = sc.nextLine();

		System.out.println("The number of vowels in given String are: " + countVowels(s));

		sc.close();
		}
		
		public static int countVowels(String s){
	
		int countVowels = 0;

		for( int i=0; i < s.length(); i++){

			char ch = s.charAt(i);
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch =='U')		{		
				countVowels++;
			}
}
		
		return countVowels;
		}
	}