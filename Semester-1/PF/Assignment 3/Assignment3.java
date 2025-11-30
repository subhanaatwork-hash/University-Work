import java.util.Scanner;

public class Assignment3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Matrix Multiplication");
            System.out.println("2. Random 0-1 Square Matrix Checker");
            System.out.println("3. Sort Array of a, b, c");
            System.out.println("4. Array Operations Menu");
            System.out.println("5. Smart Grid Optimization");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            if (choice == 1) {
                matrixMultiplication();
            } else if (choice == 2) {
                zeroOneMatrix();
            } else if (choice == 3) {
                sortABC();
            } else if (choice == 4) {
                arrayMenu();
            } else if (choice == 5) {
                smartGrid();
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }

    // QUESTION 1 
    public static void matrixMultiplication() {

        System.out.print("Enter rows of matrix A: ");
        int r1 = input.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int c1 = input.nextInt();

        System.out.print("Enter rows of matrix B: ");
        int r2 = input.nextInt();
        System.out.print("Enter columns of matrix B: ");
        int c2 = input.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication NOT possible.");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result:");
        printMatrix(C);
    }

    //  QUESTION 2 
    public static void zeroOneMatrix() {

        System.out.print("Enter size of matrix: ");
        int n = input.nextInt();

        int[][] m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (int)(Math.random() * 2);
            }
        }

        printMatrix(m);

        // Checking rows
        for (int i = 0; i < n; i++) {
            boolean all0 = true;
            boolean all1 = true;

            for (int j = 0; j < n; j++) {
                if (m[i][j] != 0) all0 = false;
                if (m[i][j] != 1) all1 = false;
            }

            if (all0) System.out.println("All 0s on row " + i);
            if (all1) System.out.println("All 1s on row " + i);
        }

        // Checking columns
        boolean anyColumn = false;

        for (int j = 0; j < n; j++) {

            boolean all0 = true;
            boolean all1 = true;

            for (int i = 0; i < n; i++) {
                if (m[i][j] != 0) all0 = false;
                if (m[i][j] != 1) all1 = false;
            }

            if (all0 || all1) {
                System.out.println("Same numbers on column " + j);
                anyColumn = true;
            }
        }

        if (!anyColumn) System.out.println("No same numbers on a column");

        // Checking major diagonal
        boolean md0 = true;
        boolean md1 = true;

        for (int i = 0; i < n; i++) {
            if (m[i][i] != 0) md0 = false;
            if (m[i][i] != 1) md1 = false;
        }

        if (md0) System.out.println("All 0s on major diagonal");
        else if (md1) System.out.println("All 1s on major diagonal");
        else System.out.println("No same numbers on major diagonal");

        // Checking sub-diagonal
        boolean sd0 = true;
        boolean sd1 = true;

        for (int i = 0; i < n; i++) {
            if (m[i][n - 1 - i] != 0) sd0 = false;
            if (m[i][n - 1 - i] != 1) sd1 = false;
        }

        if (sd0) System.out.println("All 0s on sub diagonal");
        else if (sd1) System.out.println("All 1s on sub diagonal");
        else System.out.println("No same numbers on sub diagonal");
    }

    //  QUESTION 3 
    public static void sortABC() {
        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        char[] arr = new char[n];

        System.out.println("Enter characters (a, b, or c):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.next().charAt(0);
        }

        int index = 0;

        // First place all 'a'
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'a') {
                arr[index] = 'a';
                index++;
            }
        }

        // Then 'b'
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'b') {
                arr[index] = 'b';
                index++;
            }
        }

        // Then 'c'
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'c') {
                arr[index] = 'c';
                index++;
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // QUESTION 4 
    public static void arrayMenu() {

        System.out.print("Enter size of array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        while (true) {
            System.out.println("\n--- ARRAY MENU ---");
            System.out.println("1. Count occurrences");
            System.out.println("2. Partition by first element");
            System.out.println("3. Show frequencies");
            System.out.println("4. Replace each element with sum of next 2");
            System.out.println("5. Circular left shift by 2");
            System.out.println("6. Back");
            System.out.print("Choice: ");

            int choice = input.nextInt();

            if (choice == 1) {
                countOcc(arr);

            } else if (choice == 2) {
                partition(arr);

            } else if (choice == 3) {
                duplicates(arr);

            } else if (choice == 4) {
                circular(arr);

            } else if (choice == 5) {
                shiftCircular(arr);

            } else if (choice == 6) {
                return;

            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    public static void countOcc(int[] arr) {
        System.out.print("Enter number to count: ");
        int x = input.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) count++;
        }

        System.out.println("Occurrences = " + count);
    }

    public static void partition(int[] arr) {
        int x = arr[0];
        int[] newArr = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < x) {
                newArr[left] = arr[i];
                left++;
            } else {
                newArr[right] = arr[i];
                right--;
            }
        }

        newArr[left] = x;

        System.out.println("Partitioned array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public static void duplicates(int[] arr) {

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }

    public static void circular(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = arr[(i + 1) % n];
            int b = arr[(i + 2) % n];
            newArr[i] = a + b;
        }

        System.out.println("New circular sum array:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    public static void shiftCircular(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[i] = arr[(i + 2) % n];
        }

        System.out.println("After shifting:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    // QUESTION 5 
    public static void smartGrid() {

        System.out.print("Enter rows: ");
        int r = input.nextInt();

        System.out.print("Enter cols: ");
        int c = input.nextInt();

        int[][] grid = new int[r][c];
        int[][] result = new int[r][c];

        System.out.println("Enter grid:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter threshold: ");
        int t = input.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] > t) {
                    int sum = 0;
                    int count = 0;

                    if (i > 0) {
                        sum += grid[i - 1][j];
                        count++;
                    }
                    if (i < r - 1) {
                        sum += grid[i + 1][j];
                        count++;
                    }
                    if (j > 0) {
                        sum += grid[i][j - 1];
                        count++;
                    }
                    if (j < c - 1) {
                        sum += grid[i][j + 1];
                        count++;
                    }

                    result[i][j] = sum / count;
                } else {
                    result[i][j] = grid[i][j];
                }
            }
        }

        System.out.println("Optimized Grid:");
        printMatrix(result);
    }

    // Print Matrix 
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
