import java.util.*;

class Student {
    private String StudentName;
    private String StudentRegNumber;
    private String StudentSection;
    private String department;
    private String[] courses = new String[5];
    private int courseCount = 0;
    private int attendance = 0;

    public Student(String n, String r, String s, String d) {
        StudentName = n;
        StudentRegNumber = r;
        StudentSection = s;
        department = d;
    }

    public void display() {
        System.out.println("Student Name: " + StudentName);
        System.out.println("Registration Number: " + StudentRegNumber);
        System.out.println("Section: " + StudentSection);
        System.out.println("Department: " + department);
        System.out.println("Attendance: " + attendance + "%");
        showCourses();
    }

    public void Attendance(int a) {
        attendance += a;
        if (attendance > 100)
            attendance = 100;
        System.out.println("Updated Attendance: " + attendance + "%");
    }

    public void StudentCourseRegisteration(String course) {
        if (courseCount < 5) {
            courses[courseCount] = course;
            courseCount++;
            System.out.println("Course Registered: " + course);
        } else {
            System.out.println("Only 5 courses allowed.");
        }
    }

    public void showCourses() {
        if (courseCount == 0) {
            System.out.println("No courses registered.");
        } else {
            System.out.println("Registered Courses:");
            for (int i = 0; i < courseCount; i++) {
                System.out.println((i + 1) + ". " + courses[i]);
            }
        }
    }
}

public class StudentRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();

        System.out.print("Enter Reg Number: ");
        String r = sc.nextLine();

        System.out.print("Enter Section: ");
        String s = sc.nextLine();

        System.out.print("Enter Department: ");
        String d = sc.nextLine();

        Student s1 = new Student(n, r, s, d);

        s1.StudentCourseRegisteration("OOP");
        s1.StudentCourseRegisteration("PF");
        s1.Attendance(15);

        s1.display();
    }
}
