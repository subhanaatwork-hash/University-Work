class Rectangle {
    public int length;
    public int width;

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("The area of the rectangle is: " + area());
        System.out.println("The perimeter of the rectangle is: " + perimeter());
    }
}

public class RectangleConceptLab1Task4 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.length = 9;
        r1.width = 8;
        r1.display();
        
    }
}
