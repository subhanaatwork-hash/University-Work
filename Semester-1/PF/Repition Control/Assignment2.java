import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = -1;

        do {
            System.out.println("\n------> Main Menu (Assignment-2) <-------");

            System.out.println("1 - Question 1: Checking if Social Security Number is valid or not.");

            System.out.println("2 - Question 2: Major and Status check.");

            System.out.println("3 - Question 3: Generating a number plate number.");

            System.out.println("4 - Question 4: Corresponding binary value of entered decimal integer.");

            System.out.println("5 - Question 5: Global Warming Quiz.");

            System.out.println("Press option (1-5) to execute the program and press 0 to Exit.");

            System.out.print("Enter your option: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number (0-5): ");
                sc.next();
            }

            option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) {
                case 1:
                    question1(sc);
                    break;
                case 2:
                    question2(sc);
                    break;
                case 3:
                    question3();
                    break;
                case 4:
                    question4(sc);
                    break;
                case 5:
                    question5(sc);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 0 - 5.");
            }

        } while (option != 0);
    }

    // ---------------- Question 1 ----------------
    public static void question1(Scanner sc) {
        String again;
        do {
            System.out.println("\n--- Executing Question 1 ---");
            System.out.print("Enter a SSN (DDD-DD-DDDD): ");
            String ssn = sc.nextLine();
            boolean valid = true;
            int dashCount = 0, digitCount = 0;

            // Check every character manually
            for (int i = 0; i < ssn.length(); i++) {
                String ch = ssn.substring(i, i + 1);
                if (ch.equals("-")) dashCount++;
                else if (ch.compareTo("0") >= 0 && ch.compareTo("9") <= 0) digitCount++;
                else valid = false;
            }

            if (ssn.length() == 11 && dashCount == 2 && digitCount == 9) {
                String s1 = ssn.substring(3, 4);
                String s2 = ssn.substring(6, 7);
                if (s1.equals("-") && s2.equals("-"))
                    System.out.println(ssn + " is a valid social security number.");
                else
                    System.out.println(ssn + " is an invalid social security number.");
            } else {
                System.out.println(ssn + " is an invalid social security number.");
            }

            System.out.print("Do you want to execute again? (y for yes / b for back): ");
            again = sc.nextLine().toLowerCase();
        } while (again.equals("y"));
    }

    // ---------------- Question 2 ----------------
    public static void question2(Scanner sc) {
        String again;
        do {
            System.out.println("\n--- Executing Question 2 ---");
            System.out.print("Enter two characters (e.g. M1, C4, I3): ");
            String input = sc.nextLine().toUpperCase();

            if (input.length() != 2) {
                System.out.println("Invalid input length.");
            } else {
                String first = input.substring(0, 1);
                String second = input.substring(1, 2);
                String major = "";
                String status = "";

                if (first.equals("M")) major = "Mathematics";
                else if (first.equals("C")) major = "Computer Science";
                else if (first.equals("I")) major = "Information Technology";
                else major = "Invalid";

                if (second.equals("1")) status = "Freshman";
                else if (second.equals("2")) status = "Sophomore";
                else if (second.equals("3")) status = "Junior";
                else if (second.equals("4")) status = "Senior";
                else status = "Invalid";

                if (major.equals("Invalid") || status.equals("Invalid"))
                    System.out.println("Invalid input.");
                else
                    System.out.println(major + " " + status);
            }

            System.out.print("Do you want to execute again? (y for yes / b for back): ");
            again = sc.nextLine().toLowerCase();
        } while (again.equals("y"));
    }

    // ---------------- Question 3 ----------------
    public static void question3() {
        System.out.println("\n--- Executing Question 3 ---");
        System.out.print("Generated Plate Number: ");

        for (int i = 0; i < 3; i++) {
            int randomLetter = (int) (Math.random() * 26) + 65; // ASCII for A-Z
            System.out.print((char) randomLetter);
        }

        for (int i = 0; i < 4; i++) {
            int digit = (int) (Math.random() * 10);
            System.out.print(digit);
        }
        System.out.println();
    }

    // ---------------- Question 4 ----------------
    public static void question4(Scanner sc) {
        String again;
        do {
            System.out.println("\n--- Executing Question 4 ---");
            System.out.print("Enter a decimal integer: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Please enter an integer: ");
                sc.next();
            }

            int num = sc.nextInt();
            sc.nextLine();

            if (num == 0) {
                System.out.println("Binary: 0");
            } else {
                String binary = "";
                int temp = num;
                while (temp > 0) {
                    int remainder = temp % 2;
                    binary = remainder + binary;
                    temp = temp / 2;
                }
                System.out.println("Binary equivalent of " + num + " is: " + binary);
            }

            System.out.print("Do you want to execute again? (y for yes / b for back): ");
            again = sc.nextLine().toLowerCase();
        } while (again.equals("y"));
    }

    // ---------------- Question 5 ----------------
    public static void question5(Scanner sc) {
        String again;
        do {
            System.out.println("\n--- Executing Question 5: Global Warming Quiz ---");
            int score = 0, ans;

            System.out.println("1. Which gas is most responsible for the greenhouse effect?");
            System.out.println("1. Nitrogen\n2. Carbon Dioxide\n3. Oxygen\n4. Helium");
            ans = sc.nextInt();
            if (ans == 2) score++;

            System.out.println("2. Which best describes the scientific consensus?");
            System.out.println("1. Humans mainly cause warming\n2. Natural cycles\n3. Divided\n4. Not enough data");
            ans = sc.nextInt();
            if (ans == 1) score++;

            System.out.println("3. Which argument is made by climate skeptics?");
            System.out.println("1. Data may be exaggerated\n2. Temp never changed\n3. CO2 unrelated\n4. Solar decreased");
            ans = sc.nextInt();
            if (ans == 1) score++;

            System.out.println("4. What do scientists cite as proof of human impact?");
            System.out.println("1. Volcanos\n2. Ocean currents\n3. Rising CO2 since industrial age\n4. Magnetic shifts");
            ans = sc.nextInt();
            if (ans == 3) score++;

            System.out.println("5. What is a major effect of global warming?");
            System.out.println("1. Rising sea levels\n2. Lower temps\n3. Thicker ice\n4. Less rain");
            ans = sc.nextInt();
            if (ans == 1) score++;

            sc.nextLine(); 

            System.out.println("\nYou got " + score + " out of 5 correct.");
            if (score == 5)
                System.out.println("Excellent!");
            else if (score == 4)
                System.out.println("Very good!");
            else {
                System.out.println("Time to brush up on your knowledge of global warming.");
                            }

            System.out.print("Do you want to execute again? (y for yes / b for back): ");
            again = sc.nextLine();
        } while (again.equals("y"));
    }
}
