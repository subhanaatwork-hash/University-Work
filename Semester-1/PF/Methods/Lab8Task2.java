import java.util.Scanner;
public class Lab8Task2{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer :");
        int number = sc.nextInt();

        System.out.println("The reversed number is: " + reverse(number));
        System.out.println("The number is a Palindrome? " + isPalindrome(number));

        sc.close();

    }

    public static int reverse (int number){

        int reversed = 0;

	while(number !=0){
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number / 10;
	}

        return reversed;
    }

    public static Boolean isPalindrome(int number){

        int reverse = reverse(number);

        if(number == reverse){
	return true;
        
	}else{
	return false;
	}
	
        }
}
		
		
		
		

		
		 