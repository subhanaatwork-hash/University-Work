import java.util.*;

	public class MilkProduction {
    	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total amount of milk produced (in liters): ");
        int totalMilk = input.nextInt();

        int cartonsNeeded = (totalMilk + 3) / 4;  
        int productionCost = totalMilk * 38 / 100;
        int profit = cartonsNeeded * 27 / 100;

        System.out.println("Number of cartons needed: " + cartonsNeeded);
        System.out.println("Cost of producing milk: $" + productionCost);
        System.out.println("Profit from milk: $" + profit);

        input.close();
    }
}
