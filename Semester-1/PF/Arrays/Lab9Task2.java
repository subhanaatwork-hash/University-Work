public class Lab9Task2 {

    public static void main(String[] args) {

        // Initialize array with 10 elements
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Call the modify function
        modify(numbers);

        // Print modified array
        System.out.println("Modified Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Function to multiply each element by 3
    public static void modify(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 3;
        }
    }
}

