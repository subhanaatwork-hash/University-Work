import java.util.Scanner;

public class lab7ReplaceH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int first = -1, last = -1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'h' || c == 'H') {
                if (first == -1) {
                    first = i; 
                }
                last = i;      
            }
        }

       
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

           
            if ((c == 'h' || c == 'H') && i != first && i != last) {
                result += 'H';
            } else {
                result += c; // keep first, last, and other characters as they are
            }
        }

        System.out.println(result);
        sc.close();
    }
}
