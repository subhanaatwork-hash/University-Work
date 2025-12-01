import java.util.Scanner;

public class Lab10Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter number of rows for Matrix A: ");
        int rowsA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colsA = sc.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter number of rows for Matrix B: ");
        int rowsB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colsB = sc.nextInt();

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal rows of B.");
            sc.close();
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        // Input Matrix A
        System.out.println("\nEnter elements of Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrixA[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("\nEnter elements of Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrixB[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display Matrix A
        System.out.println("\nMatrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }

        // Display Matrix B
        System.out.println("\nMatrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }

        // Display Result
        System.out.println("\nResulting Matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
