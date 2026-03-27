 final class Fraction {
    private final int numerator;
    private final int denominator;
    
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }
    
    public Fraction add(Fraction other) {
        int newNum = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDen = this.denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }
    
    public Fraction subtract(Fraction other) {
        int newNum = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDen = this.denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }
    
    public Fraction multiply(Fraction other) {
        int newNum = this.numerator * other.numerator;
        int newDen = this.denominator * other.denominator;
        return new Fraction(newNum, newDen);
    }
    
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int newNum = this.numerator * other.denominator;
        int newDen = this.denominator * other.numerator;
        return new Fraction(newNum, newDen);
    }
    
    public String toString() {
        return numerator + "/" + denominator;
    }
}
    
    public class Runner1{
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        
        System.out.println("Fraction 1: " + f1);
        System.out.println("Fraction 2: " + f2);
        System.out.println("Addition: " + f1.add(f2));
        System.out.println("Subtraction: " + f1.subtract(f2));
        System.out.println("Multiplication: " + f1.multiply(f2));
        System.out.println("Division: " + f1.divide(f2));
    }
}