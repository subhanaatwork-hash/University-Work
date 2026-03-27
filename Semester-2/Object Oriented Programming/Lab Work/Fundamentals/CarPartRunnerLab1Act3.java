import java.util.Scanner;

class carPart{
    private String modelNumber;
    private String partNumber;
    private String cost;
    private int speed=0;

    public void setParameter(String x, String y, String z){
        modelNumber = x;
        partNumber = y;
        cost = z;
}

    public void display(){
        System.out.println("Model is :" + modelNumber + "\nPart Number is :" + partNumber + "\nCost is:" + cost);
    }

    public void speedUp(){
        speed = speed + 10;
        System.out.println("Speed increased due to acceleration. Current speed is: "  + speed);
    }

    public void speedDown(){
        if( speed > 0){
            speed = speed -10;
            System.out.println("Speed decreased due to deceleration. Current speed is: " + speed);
        }
        if( speed < 0){
            speed = 0; //as speed cannot be -ve
            System.out.println("Current speed is: " + speed);
        }
    }
}

    public class CarPartRunnerLab1Act3{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            carPart car1 = new carPart();

            System.out.println("What is model number?");
            String x = sc.nextLine();

            System.out.println("What is part number?");
            String y = sc.nextLine();

            System.out.println("What is cost of the car?");
            String z = sc.nextLine();

            car1.setParameter( x,y,z);
            car1.display();

            System.out.println("Car is sped up or down?" + "\n 1.Sped up  \n 2.Sped down  \n 3.Exit");
            int choice = sc.nextInt();
            if( choice == 1){
                car1.speedUp();
            }
            else if( choice ==2){
                car1.speedDown();
            }
            else{
                System.out.println("Car is stationary. Current speed is 0.");
            }
    }
}