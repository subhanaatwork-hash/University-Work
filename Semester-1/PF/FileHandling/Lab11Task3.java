import java.io.*;
import java.util.*;

public class Lab11Task3 {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;   // 0,1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));
            ArrayList<Integer> list = new ArrayList<>();
            String line;

            // Read data from file
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();

            // Remove prime numbers
            list.removeIf(Lab11Task3::isPrime);

            // Write updated data back to same file
            FileWriter fw = new FileWriter("numbers.txt", false); // overwrite mode

            for (int num : list) {
                fw.write(num + "\n");
            }

            fw.close();

            System.out.println("Prime numbers removed and file updated.");

        } catch (Exception e) {
            System.out.println("Error handling file.");
        }
    }
}

