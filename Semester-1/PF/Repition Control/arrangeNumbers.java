import java.util.Scanner;

public class arrangeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // a) Print numbers from A to B (A ≤ B)

        System.out.println("Print all numbers from A to B inclusively");
        System.out.print("Enter A: ");
        int A = input.nextInt();
        System.out.print("Enter B: ");
        int B = input.nextInt();

        if (A <= B) {
            System.out.print("Numbers from " + A + " to " + B + ": ");
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Invalid input. A should be ≤ B.");
        }
        System.out.println("\n");

        // b) Print numbers from A to B (ascending if A < B, else descending)

        System.out.println("Task (b): Print numbers ascending or descending");
        System.out.print("Enter A: ");
        A = input.nextInt();
        System.out.print("Enter B: ");
        B = input.nextInt();

        if (A < B) {
            System.out.print("Ascending order: ");
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.print("Descending order: ");
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // c) Sum of N numbers

        System.out.println("Task (c): Sum of N numbers");
        System.out.print("Enter N (number of integers): ");
        int N = input.nextInt();

        int sum = 0;
        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            int num = input.nextInt();
            sum += num;
        }
        System.out.println("Sum = " + sum);
        System.out.println();

  
        // d) Sum of cubes: 1³ + 2³ + … + N³
 
        System.out.println("Task (d): Sum of cubes up to N");
        System.out.print("Enter N: ");
        N = input.nextInt();

        long cubeSum = 0;
        for (int i = 1; i <= N; i++) {
            cubeSum += (long) i * i * i;
        }
        System.out.println("Sum of cubes from 1³ to " + N + "³ = " + cubeSum);

        input.close();
    }
}
