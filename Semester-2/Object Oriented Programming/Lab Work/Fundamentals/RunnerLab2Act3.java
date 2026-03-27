public class Point{
    private int x, y;

    public Point(){
        x=1;
        y=2;
    }
    public Point( int a, int b){
        x = a;
        y = b;

    }
    public void setX(int a){
        x = a;
    }
    public void setY(int b){
        y = b;
    }
    public void display(){
        System.out.println("x coordinate is = " + x + " y coordinate is = "  +y);

    }
    public void movePoint( int a, int b){
        x = x + a;
        y = y + b;
        System.out.println( "x coordinate after moving = " + x  + "y coordinate after moving = " + y);
    }
    }
    public class RunnerLab2Act3{
        public static void main(String [] args){

            Point p1 = new Point();
            p1.movePoint(2,3);
            p1.display();

            Point p2 = new Point();
            p2.movePoint(2,3);
            p2.display();

        }
    }
    