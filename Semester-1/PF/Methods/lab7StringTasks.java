import java.util.Scanner;

public class lab7StringTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter a string:");
        String s = sc.nextLine();

        // 1) third character
        System.out.println(s.charAt(2));

        // 2) second to last character
        System.out.println(s.charAt(s.length() - 2));

        // 3) first five characters
        System.out.println(s.substring(0, 5));

        // 4) all but last two characters
        System.out.println(s.substring(0, s.length() - 2));

        // 5) characters with even indices
        for (int i = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        // 6) characters with odd indices
        for (int i = 1; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        // 7) all characters in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        // 8) every second character in reverse order
        for (int i = s.length() - 1; i >= 0; i -= 2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

        // 9) length of the string
        System.out.println(s.length());

        sc.close();
    }
}
