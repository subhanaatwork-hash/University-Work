import java.io.*;
public class Lab11Act3{
    public static void main(String [] args){
        int rno =101;
        String name ="John Doe";
        int marks =88;

        try{
            FileOutputStream fos = new FileOutputStream("c: \\myfile.txt");
            PrintWriter writer = new PrintWriter(fos);

            writer.println(rno);
            writer.println(name);
            writer.println(marks);
            System.out.println("Data written to file successfully.");
            writer.close();
        }
        catch(IOException e){
            System.out.println("An error has occurred: " );
        }
    }
}