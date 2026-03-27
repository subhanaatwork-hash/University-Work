/*Write a class Marks with three data members to store three marks. Create two constructors and 
a method to calculate and return the sum.*/

class Marks{
    private int chemMarks;
    private int mathsMarks;
    private int phyMarks;

    public Marks(){
        chemMarks = 0;
        mathsMarks = 0;
        phyMarks = 0;
    }
    public Marks( int c, int m, int p){
        chemMarks = c;
        phyMarks = p;
        mathsMarks = m;
    }
    public int sum(){
     return chemMarks + phyMarks + mathsMarks;
         
     }
}

    public class RunnerLab2Task4{
        public static void main(String args []){
            Marks m1 = new Marks(75,48,90);
            System.out.println("The sum of marks is:" + m1.sum());
             Marks m2 = new Marks(90,80,70);
             System.out.println("The sum of marks is:" + m2.sum());
        }
    }