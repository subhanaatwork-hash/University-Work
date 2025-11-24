import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Ask for input
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int startDay = sc.nextInt();

        // Step 2: Month names
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Step 3: Number of days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Step 4: Adjust for leap year
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // February = 29 days
        }

        // Step 5: Print all 12 months
        for (int i = 0; i < 12; i++) {
            printMonth(year, months[i], daysInMonth[i], startDay);
            // Calculate the start day for next month
            startDay = (startDay + daysInMonth[i]) % 7;
        }

        sc.close();
    }

    // Method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Method to print one month
    public static void printMonth(int year, String month, int numOfDays, int startDay) {
        System.out.println("\n\t\t" + month + " " + year);
        System.out.println("---------------------------------------------------");
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");

        // Print initial spaces for the first day
        for (int i = 0; i < startDay; i++) {
            System.out.print("\t");
        }

        // Print all days of the month
        for (int day = 1; day <= numOfDays; day++) {
            System.out.print(day + "\t");

            // Go to next line after Saturday
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n"); // blank line after each month
    }
}
