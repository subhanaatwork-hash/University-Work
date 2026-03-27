package CompositionLab;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== LAB TASK 1: Person with Address ===\n");
        
        // Create an address
        Address addr1 = new Address(5, 12, "Karachi", 4400);
        
        // Create a person with that address
        Person person1 = new Person("Ali Ahmed", 25, addr1);
        
        // Test getters and setters
        System.out.println("Initial Person Details:");
        person1.displayPerson();
        
        // Modify address using setters
        person1.getAddress().setStreetNumber(10);
        person1.getAddress().setHouseNumber(25);
        
        System.out.println("\nAfter modifying address:");
        person1.displayPerson();

        System.out.println("\n====================================\n");
        System.out.println("=== LAB TASK 2: Book with Author ===\n");

        // Create an author (Person) with address
        Address authorAddr = new Address(8, 45, "Lahore", 5400);
        Person author = new Person("Dr. Ahmed", 45, authorAddr);
        
        // Create a book with this author
        Book book1 = new Book("Java Programming", "Oxford Publications", author);
        
        System.out.println("Initial Book Details:");
        book1.displayBook();
        
        // Modify author's address
        System.out.println("\n--- Modifying Author's Address ---");
        book1.getAuthor().getAddress().setCityName("Islamabad");
        book1.getAuthor().getAddress().setCityCode(44000);
        
        System.out.println("Updated Book Details:");
        book1.displayBook();

        System.out.println("\n====================================\n");
        System.out.println("=== LAB TASK 3: Line between two Points ===\n");

        // Create two points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        
        // Create first line
        Line line1 = new Line(p1, p2);
        System.out.print("Line 1: ");
        line1.displayLine();
        
        // Create second line
        Point p3 = new Point(1, 1);
        Point p4 = new Point(4, 5);
        Line line2 = new Line(p3, p4);
        System.out.print("Line 2: ");
        line2.displayLine();
        
        // Create third line with different points
        Point p5 = new Point(-2, 3);
        Point p6 = new Point(2, -1);
        Line line3 = new Line(p5, p6);
        System.out.print("Line 3: ");
        line3.displayLine();

        System.out.println("\n====================================\n");
        System.out.println("=== LAB TASK 4: Pizza Order ===\n");

        // Create several pizzas
        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 1, 0);
        Pizza pizza3 = new Pizza("small", 1, 0, 1);
        
        // Display individual pizzas
        System.out.println("Individual Pizzas:");
        System.out.println(pizza1.getDescription());
        System.out.println(pizza2.getDescription());
        System.out.println(pizza3.getDescription());
        
        // Create pizza order
        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1);
        order.addPizza(pizza2);
        order.addPizza(pizza3);
        
        // Display order and total cost
        order.displayOrder();
        
        // Try to add another pizza (should fail as limit is 3)
        System.out.println("\nTrying to add a 4th pizza:");
        Pizza pizza4 = new Pizza("large", 2, 2, 2);
        order.addPizza(pizza4);

        System.out.println("\n====================================");
        System.out.println("All Lab Tasks Completed Successfully!");
    }
}