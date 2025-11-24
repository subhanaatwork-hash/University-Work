import java.util.*;

public class Lab9Task1 {
    public static void main (String [] args){
        int[] ratings = new int[40];

        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = (int)(Math.random() * 10) + 1;  
           
        }

        System.out.println("Food Ratings:");
        for (int r : ratings) {
            System.out.print(r + " ");
        }
        System.out.println("\n");

        // Frequency array (index 1–10)
        int[] frequency = new int[11];

        int sum = 0;
        int min = 10;
        int max = 1;

        for (int r : ratings) {
            frequency[r]++;
            sum += r;

            if (r < min) min = r;
            if (r > max) max = r;
        }

        double average = (double) sum / ratings.length;

        System.out.println("Summary of Poll Results:");
        System.out.println("Rating\tFrequency");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\t\t" + frequency[i]);
        }

        System.out.println("\nMinimum Rating: " + min);
        System.out.println("Maximum Rating: " + max);
        System.out.printf("Average Rating: %.2f\n", average);
    }
}