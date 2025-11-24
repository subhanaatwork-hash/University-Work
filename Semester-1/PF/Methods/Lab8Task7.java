import java.util.Scanner;

public class Lab8Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line of lowercase words:");
        String line = sc.nextLine();

        String result = "";
        int start = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ' ' || i == line.length() - 1) {
                int end = (line.charAt(i) == ' ') ? i : i + 1;
                String word = line.substring(start, end);
                result += capitalize(word);
                if (line.charAt(i) == ' ') {
                    result += " ";
                }
                start = i + 1;
            }
        }

        System.out.println(result);
        sc.close();
    }

    public static String capitalize(String lower_case_word) {
        if (lower_case_word.length() == 0) return "";
        return Character.toUpperCase(lower_case_word.charAt(0)) + lower_case_word.substring(1);
    }
}
