import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab11Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // FileWriter is used to write data into a file
            FileWriter fw = new FileWriter("numbers.txt");

            System.out.println("Enter 10 integers:");

            for (int i = 0; i < 10; i++) {
                int num = input.nextInt();

                // Write number followed by a newline
                fw.write(num + "\n");
            }

            fw.close(); // Closing filewriter
            System.out.println("Data has been saved to numbers.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

        input.close();
    }
}