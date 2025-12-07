import java.io.*;
import java.util.Scanner;

public class Lab11Act5 {

    Scanner input = new Scanner(System.in);
    int rno;
    String name;
    int marks;
    try{
        FileOutputStream fos = new FileOutputStream("c:\\myfile.txt", true);
        PrintWriter writer = new PrintWriter(fos);

        while(true){
            System.out.print("Enter Roll Number ");
            rno = input.nextInt();
            if(rno ==0)
                break;
            System.out.print("Enter Name ");
            name = input.next();
            System.out.println("Enter Marks ");
            marks = input.nextInt();
            writer.println(rno);
            writer.println(name);
            writer.println(marks);

        }
        System.out.println("Sucessfully written to file.");
        writer.close();
    }
    catch(IOException e){
        System.out.println("An error has occurred: " );
    }
}
}