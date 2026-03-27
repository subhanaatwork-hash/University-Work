import encapsulation.*;
public class RunnerAct{
    public static void main(String [] args){
        /*Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println("The circumeference of the circle is: " + c1.CalculateCircumference());
        int r = c1.getRadius();
        Circle c2 = new Circle(r);
        c2.setRadius(5);
        System.out.println(" The cirumcference of circle c2 is: " + c2.CalculateCircumference());

        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setWidth(5);
        System.out.println("Area of rectangle is: " + rect.area());
        System.out.println("Width of rectangle is: " + rect.getWidth()); */
    
        /*Point p1 = new Point();
        p1.setX(10);
        p1.setY(20);
        p1.display();
        Point p2 = new Point(30, 40);
        p2.movePoint(2,3);
        p2.display(); */

        Marks m1 = new Marks(30,40,50);
        m1.display();
        Marks m2 = new Marks();
        m2.display();
        
    }
}