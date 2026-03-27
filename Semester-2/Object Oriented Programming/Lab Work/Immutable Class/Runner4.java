final class Rectangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int calculateArea() {
        return width * height;
    }
    
    public String toString() {
        return "Rectangle at (" + x + "," + y + ") width: " + width + " height: " + height;
    }
}
    public class Runner4{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(0, 0, 10, 5);
        Rectangle rect2 = new Rectangle(2, 3, 7, 4);
        
        System.out.println("Rectangle 1: " + rect1);
        System.out.println("Area: " + rect1.calculateArea());
        System.out.println();
        
        System.out.println("Rectangle 2: " + rect2);
        System.out.println("Area: " + rect2.calculateArea());
        System.out.println();
        
        System.out.println("Rectangle 2 details:");
        System.out.println("X: " + rect2.getX());
        System.out.println("Y: " + rect2.getY());
        System.out.println("Width: " + rect2.getWidth());
        System.out.println("Height: " + rect2.getHeight());
    }
}