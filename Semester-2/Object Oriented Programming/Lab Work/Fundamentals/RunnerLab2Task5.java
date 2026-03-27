/*Write a class Time with three data members to store hr, min and seconds. Create two constructors
 and apply checks to set valid time. Also create display function which displays all data members.*/

    class Time{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(){
        hours = 9;
        minutes = 3;
        seconds = 2;
    }

    public Time(int h, int m, int s){

        if(h >= 0 && h <= 23){
            hours = h;
        }
        else{
            System.out.println("Invalid hours");
            hours = 0;
        }

        if(m >= 0 && m <= 59){
            minutes = m;
        }
        else{
            System.out.println("Invalid minutes");
            minutes = 0;
        }

        if(s >= 0 && s <= 59){
            seconds = s;
        }
        else{
            System.out.println("Invalid seconds");
            seconds = 0;
        }
    }

    public void display(){
        System.out.println("The time is: " + hours + ":" + minutes + ":" + seconds);
    }
}

public class RunnerLab2Task5{
    public static void main(String [] args){
        Time t1 = new Time();
        t1.display();

        Time t2 = new Time(9,8,7);
        t2.display();
    }
}