package CompositionLab;

public class PizzaOrder {
    private Pizza[] pizzas;
    private int pizzaCount;
    private static final int MAX_PIZZAS = 3;

    public PizzaOrder() {
        pizzas = new Pizza[MAX_PIZZAS];
        pizzaCount = 0;
    }
    public boolean addPizza(Pizza pizza) {
        if (pizzaCount < MAX_PIZZAS) {
            pizzas[pizzaCount] = pizza;
            pizzaCount++;
            return true;
        } else {
            System.out.println("Cannot add more pizzas. Maximum limit reached.");
            return false;
        }
    }
    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < pizzaCount; i++) {
            total += pizzas[i].calcCost();
        }
        return total;
    }
    public void displayOrder() {
        System.out.println("\n=== PIZZA ORDER ===");
        for (int i = 0; i < pizzaCount; i++) {
            System.out.println((i+1) + ". " + pizzas[i].getDescription());
        }
        System.out.println("Total Cost: $" + calcTotal());
    }
}