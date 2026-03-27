package CompositionLab;

public class Pizza {
    private String size; // small, medium, large
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size.toLowerCase();
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size.toLowerCase();
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }
    
    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }
    
    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        int baseCost;
        switch(size) {
            case "small":
                baseCost = 10;
                break;
            case "medium":
                baseCost = 12;
                break;
            case "large":
                baseCost = 14;
                break;
            default:
                baseCost = 10;
        }
        
        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        return baseCost + (totalToppings * 2);
    }

    public String getDescription() {
        return "Pizza [Size: " + size + "\nCheese: " + cheeseToppings +  "\nPepperoni: " + pepperoniToppings +  "\nHam: " + hamToppings + "\nCost: $" + calcCost() + "]";
    }
}