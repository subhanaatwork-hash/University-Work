class Fraction {

    private int num;
    private int den;

    public Fraction() {
        num = 0;
        den = 1;
    }

    public Fraction(int n, int d) {
        num = n;
        den = d;
    }

    public void setNum(int n) {
        num = n;
    }

    public void setDen(int d) {
        den = d;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void display() {
        System.out.println(num + "/" + den);
    }

    public boolean equals(Fraction f) {
        return (num == f.num && den == f.den);
    }
}

public class FractionTesting {
    public static void main(String[] args) {

        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 2);

        f1.display();
        f2.display();

        System.out.println(f1.equals(f2));
    }
}