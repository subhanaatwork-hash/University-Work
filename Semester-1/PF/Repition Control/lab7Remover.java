import java.util.Scanner;

public class lab7ReplaceH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int first = str.indexOf('h');      // first 'h'
        int last  = str.lastIndexOf('h');  // last 'h'

        String result = ""; // empty string to store result

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'h' && i != first && i != last) {
                result += 'H'; // replace middle h's with H
            } else {
                result += c;   // keep all other characters
            }
        }

        System.out.println(result);

        sc.close();
    }
}
