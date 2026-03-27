package CompositionLab;

public class Point {
    private int xcord;
    private int ycord;

    public Point(){}

    public Point(int xcord, int ycord) {
        this.xcord = xcord;
        this.ycord = ycord;
    }

    public int getXcord() {
        return xcord;
    }
     public void setXcord(int xcord) {
        this.xcord = xcord;
    }

    public int getYcord() {
        return ycord;
    }

    public void setYcord(int ycord) {
        this.ycord = ycord;
    }

    public void display() {
        System.out.print("(" + xcord + ", " + ycord + ")");
    }
}