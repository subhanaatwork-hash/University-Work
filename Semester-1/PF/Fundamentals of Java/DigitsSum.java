import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int digit1 = number % 10;    // we used %10 because it is used to extact remainder when divided by 10 which is last digit of  a number(tens place)
        int digit2 = (number / 10) % 10;  
        int digit3 = (number / 100) % 10; 
        int digit4 = number / 1000;       

        int sum = digit1 + digit2 + digit3 + digit4;

        System.out.println("The sum of the digits is " + sum);

        input.close();
    }
}
