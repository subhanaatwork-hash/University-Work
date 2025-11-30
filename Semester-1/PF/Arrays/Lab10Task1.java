import java.util.Scanner;
public class Lab10Task1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][4];
        System.out.println("Enter 12 integars for a 3 X 4 array:");
        for(int i=0;i<3;i++){
            for(int j= 0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;
        for(int i=0; i<3; i++){
            int sum= 0;
            for(int j =0; j<4; j++){
                sum += arr[i][j];
            }
            if(sum> maxRowSum){
                maxRowSum = sum;
                maxRowIndex = i;
            }
        }
        int maxColSum = Integer.MIN_VALUE;
        int maxColIndex = -1;
        for(int j=0; j<4; j++){
            int sum= 0;
            for(int i =0; i<3; i++){
                sum += arr[i][j];
            }
            if(sum> maxColSum){
                maxColSum = sum;
                maxColIndex = j;
            }
        }
        System.out.println("Row with maximum sum: Row " + (maxRowIndex + 1) + " (Sum = " + maxRowSum + ")"); 
        System.out.println("Coloumn with maximum sum: Coloumn " + (maxColIndex + 1) + " (Sum = " + maxColSum + ")"); 
    }
    
}
