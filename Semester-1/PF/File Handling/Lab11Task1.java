import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Lab11Task1{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        try(FileWriter writer = new FileWriter("data.txt")){
            System.out.print("Enter integers separated by spaces: ");
            String [] nums = sc.nextLine().split("");

            for(String num : nums){
                writer.write(num + "\n");
            }
            System.out.println("Numbers saved to file.");
        }
        catch(IOException e){
            System.out.println("An error has occurred: " );
        }
        sc.close();
    }
}
