package CompositionLab;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(){}
    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double findLength() {
        int x1 = startPoint.getXcord();
        int y1 = startPoint.getYcord();
        int x2 = endPoint.getXcord();
        int y2 = endPoint.getYcord();
        
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public void displayLine() {
        System.out.print("Line from ");
        startPoint.display();
        System.out.print(" to ");
        endPoint.display();
        System.out.println(" | Length: " + findLength());
    }
}