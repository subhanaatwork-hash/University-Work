public class lab8DaysInYear {

    public static void main(String[] args) {
        System.out.println("Year\tDays");

        for (int year = 2000; year <= 2020; year++) {
            int days = numberOfDaysInAYear(year);
            System.out.println(year + " " + days);
        }
    }

 
    public static int numberOfDaysInAYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366; // Leap year
        } else {
            return 365; // Regular year
        }
    }
}
