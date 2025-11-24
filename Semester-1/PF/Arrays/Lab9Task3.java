public class Lab9Task3 {
    public static void main(String[] args) {

        int[] original = {10, 20, 30, 40, 50};
        int[] reversed = new int[original.length];

        // Copy in reverse order
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }

        // Display original array
        System.out.println("Original Array:");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println("\nReversed Copy:");

        // Display reversed array
        for (int num : reversed) {
            System.out.print(num + " ");
        }
    }
}

    
