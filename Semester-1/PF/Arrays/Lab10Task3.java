import java.util.Scanner;
public class Lab10Task3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][4];
        System.out.println("Enter 12 integars for a 3 X 4 array:");
        for(int i=0;i<3;i++){
            for(int j= 0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
