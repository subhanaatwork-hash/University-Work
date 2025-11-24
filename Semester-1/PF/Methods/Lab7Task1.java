import java.util.*;
public class Lab7Task1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter point 1(latitude, longitude) in degrees:");
        double lat1 = Math.toRadians(sc.nextDouble());
        double long1 = Math.toRadians(sc.nextDouble());
        System.out.println("Enter point 2(latitude, longitude) in degrees:");
        double lat2 = Math.toRadians(sc.nextDouble());
        double long2 = Math.toRadians(sc.nextDouble());

        final double EARTH_RADIUS = 6371.0;

        double distance = EARTH_RADIUS * Math.acos( Math.sin(lat1) * Math.sin(lat2)+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1-long2));

        System.out.printf("The distance between point 1 and point 2 is %.2f km%n" , distance);
    }
}