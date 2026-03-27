class Car {

    public String brand;
    public int speed;
    public int price;

    public void show() {
        System.out.println("Brand of the car is: " + brand);
        System.out.println("Speed of the car is: " + speed + " km/h");
        System.out.println("Price of the car is: " + price);
        System.out.println();
    }

    public void speedUp(int increase) {
        speed = speed + increase;
    }

    public void speedDown(int decrease) {
        speed = speed - decrease;

        if (speed < 0) {
            speed = 0;
        }
    }
}

public class CarConceptLab1Task3 {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "Toyota";
        c1.speed = 120;
        c1.price = 900000;

        c2.brand = "Honda";
        c2.speed = 140;
        c2.price = 1000000;

        c1.speedUp(20);
        c1.speedDown(50);

        c2.speedUp(10);
        c2.speedDown(30);

        c1.show();
        c2.show();
    }
}