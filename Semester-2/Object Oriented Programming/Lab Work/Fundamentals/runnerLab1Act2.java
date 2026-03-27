class Rectangle{
    private int length;
    private int width;

    public Rectangle(){  
        length = 5;
        width = 2;
    
    }
    public Rectangle( int l, int w){
        length = l;
        width = w;
    }
    public int calculateArea(){
        return(length * width);
    }
}
    public class runnerLab1Act2{
        public static void main(String args[]){
            Rectangle r1 = new Rectangle();
            System.out.println(r1.calculateArea());
            Rectangle r2 = new Rectangle(10,20);
            System.out.println(r2.calculateArea());
        }
    }
