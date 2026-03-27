class Time{
    public int hours; 
    public int minutes; 
    public int seconds; 
    public void display(){ 
    System.out.println("The time is:" + hours + ":" + minutes + ":" + seconds); 
} 
} 
public class TimeDisplayLab1Task2{ 
    public static void main (String [] args){ 
        Time t1 = new Time(); 
        Time t2 = new Time(); 
        t1.hours = 10; 
        t1.minutes = 2; 
        t1.seconds = 3; 
        t1.display(); 
        t2.hours = 3; 
        t2.minutes = 10; 
        t2.seconds = 39; 
        t2.display(); 
    } 
}