final class Employee {
    private final String name;
    private final int age;
    private final double salary;
    
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public double calculateTax() {
        double tax = 0.0;
        
        if (salary <= 10000) {
            tax = 0;
        }
        else if (salary <= 40000) {
            tax = (salary - 10000) * 0.10;
        }
        else if (salary <= 80000) {
            tax = (30000 * 0.10) + (salary - 40000) * 0.20;
        }
        else {
            tax = (30000 * 0.10) + (40000 * 0.20) + (salary - 80000) * 0.30;
        }
        
        return tax;
    }
    
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: $" + salary;
    }
}
public class Runner2{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 30, 95000);
        Employee emp2 = new Employee("Jane Smith", 25, 45000);
        Employee emp3 = new Employee("Bob Johnson", 40, 25000);
        
        System.out.println("Employee 1: " + emp1);
        System.out.println("Tax owed: $" + emp1.calculateTax());
        System.out.println();
        
        System.out.println("Employee 2: " + emp2);
        System.out.println("Tax owed: $" + emp2.calculateTax());
        System.out.println();
        
        System.out.println("Employee 3: " + emp3);
        System.out.println("Tax owed: $" + emp3.calculateTax());
    }
}