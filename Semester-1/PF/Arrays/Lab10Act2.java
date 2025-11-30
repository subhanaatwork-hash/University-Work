import java.util.Scanner;

public class Lab10Act2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] array = {
            {11, 12, 13},
            {14, 15, 16},
            {17, 18, 19},
            {20, 21, 22}
        };

        System.out.println("The given 2D array is:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nThe prime numbers in 2D array are:");
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (isPrime(array[i][j])) {
                    System.out.println(array[i][j]);
                    count++;
                }
            }
        }

        System.out.println("Total prime numbers = " + count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
