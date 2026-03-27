//Course Result
class courseResult{
    public String studentName;
    public String courseName;
    public String grade;

    public void display(){
        System.out.println("Student name is: \t"  +  studentName + "\n Course Name is: \t" +  courseName + "\n Grade is \t" +  grade);

    }
}

public class courseResultRunLab1Act1{
    public static void main( String [] args){
        courseResult c1 = new courseResult();
        c1.studentName = "Ali";
        c1.courseName = "OOPS";
        c1.grade = "pass";
        c1.display();

        courseResult c2 = new courseResult();
        c2.studentName = "Ubaida";
        c2.courseName = "Bioinformatics";
        c2.grade = "fail";
        c2.display();

        
    }
}