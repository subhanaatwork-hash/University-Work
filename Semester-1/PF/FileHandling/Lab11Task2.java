import java.io.*;
import java.util.*;

public class Lab11Task2 {
    public static void main(String[] args) {
        try {
            // Read file line by line
            BufferedReader br = new BufferedReader(new FileReader("numbers.txt"));

            ArrayList<Integer> list = new ArrayList<>();
            String line;

            // Read each line and convert to integer
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            br.close();

            // Sort the numbers
            Collections.sort(list);

            System.out.println("Sorted Data:");
            for (int num : list) {
                System.out.println(num);
            }

        } catch (Exception e) {
            System.out.println("Error reading file.");
        }
    }
}

