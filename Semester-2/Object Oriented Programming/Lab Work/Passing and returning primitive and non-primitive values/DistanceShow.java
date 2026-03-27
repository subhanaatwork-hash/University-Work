class Distance {
    private double feet;
    private double inches;

    public Distance() {
        feet = 0.0;
        inches = 0.0;
    }

    public Distance(double f, double i) {
        feet = f;    // no conflict, so no 'this' needed
        inches = i;
    }

    public void setFeet(double f) {
        feet = f;
    }

    public void setInches(double i) {
        inches = i;
    }

    public double getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    // Add method without using 'this'
    public Distance add(Distance d) {
        double totalFeet = feet + d.getFeet();   // use different local variable names
        double totalInches = inches + d.getInches();

        if(totalInches >= 12) {
            totalFeet += (int)(totalInches / 12); // convert extra inches to feet
            totalInches = totalInches % 12;       // remaining inches
        }

        return new Distance(totalFeet, totalInches);
    }

    public void display() {
        System.out.printf("The added distance is: %.2f feet and %.2f inches.\n",  feet, inches);
    }
}

public class DistanceShow {
    public static void main(String[] args) {
        Distance d1 = new Distance(8.9, 6.9);
        Distance d2 = new Distance(2.0, 1.8);

        Distance d3 = d1.add(d2); // add distances

        d3.display(); // display result
    }
}