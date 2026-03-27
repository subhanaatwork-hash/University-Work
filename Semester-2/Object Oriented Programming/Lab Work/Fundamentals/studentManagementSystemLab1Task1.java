import java.util.Scanner;
class Student {

    int studentId;
    String name;
    int age;
    String program;
    int semester;
    String[] courses = new String[5];

    void registerCourses() {
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter course " + (i + 1) + ": ");
            Scanner input = new Scanner(System.in);
            courses[i] = input.nextLine();
        }
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);

        System.out.println("Registered Courses:");
        for (int i = 0; i < 5; i++) {
            System.out.println(courses[i]);
        }
    }
}

public class studentManagementSystemLab1Task1 {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter Student ID: ");
        s1.studentId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name: ");
        s1.name = input.nextLine();

        System.out.print("Enter Age: ");
        s1.age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Program: ");
        s1.program = input.nextLine();

        System.out.print("Enter Semester: ");
        s1.semester = input.nextInt();

        s1.registerCourses();
        s1.displayStudent();
    }
}