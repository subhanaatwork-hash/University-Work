/*Create a class ―Distance‖ with two constructors (no argument, and two argument), two data members 
(feet and inches). Also create display function which displays all data members.*/

class Distance{
    private int feet;
    private int inches;
   
    public Distance(){ //no arg constructor
        feet = 1;
        inches = 2;
    }
    public Distance( int f, int i){
        feet = f;
        inches = i;
        
    }

    public void display(){
        System.out.println("The distance is : " + feet + "'" + inches);

    }
}
public class RunnerLab2Task3{
    public static void main(String args []){

        Distance d1 = new Distance();
        d1.display();
        Distance d2 = new Distance(10,9);
        d2.display();
    }
    
    }
