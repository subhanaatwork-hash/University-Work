import java.util.Scanner;

public class Lab10Task2 {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];

        System.out.println("Enter 3x4 integer matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[] rowCount = new int[3];
        int[] colCount = new int[4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (isPrime(arr[i][j])) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int maxRow = 0;
        for (int i = 0; i < 3; i++) {
            if (rowCount[i] > rowCount[maxRow]) {
                maxRow = i;
            }
        }

        int maxCol = 0;
        for (int j = 0; j < 4; j++) {
            if (colCount[j] > colCount[maxCol]) {
                maxCol = j;
            }
        }

        System.out.println("Row with most primes: " + maxRow);
        System.out.println("Column with most primes: " + maxCol);
    }
}
