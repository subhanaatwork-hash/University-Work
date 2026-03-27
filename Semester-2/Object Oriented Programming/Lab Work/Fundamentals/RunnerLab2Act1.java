class Rectangle{
    public int length;
    public int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    public int calculateArea(){
        return length * width;
    }
}

public class RunnerLab2Act1{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle(10, 5);
        System.out.println(r1.calculateArea());
    }
}
