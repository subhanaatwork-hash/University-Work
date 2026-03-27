//Circle as an object
import java.util.Scanner;

class Circle {
    public Scanner sc = new Scanner(System.in);
    public double radius;
    public double pi = 3.14;

    public Circle() { //this one is no arg constructor
        System.out.println("Enter the radius of the circle:");
        radius = sc.nextDouble();
    }

    public Circle(double r) { //paramterized constructor this one
        radius = r;
    }

    public double calculateCircumference() {
        return 2 * pi * radius;
    }
}

public class RunnerLab2Task1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The circumference of the circle is: " + c1.calculateCircumference());
    }
}
