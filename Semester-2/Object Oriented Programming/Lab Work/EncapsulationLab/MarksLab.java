class Marks{
    private int chemMarks;
    private int phyMarks;
    private int bioMarks;
    public Marks(){
        phyMarks = 0;
        chemMarks = 0;
        bioMarks = 0;
    }
    public Marks(int p, int c, int b){
        phyMarks = p;
        chemMarks = c;
        bioMarks = b;
    }
    public void setchemMarks( int c){
        chemMarks = c;
    }
    public void setphyMarks( int p){
        phyMarks = p;
    }
    public void setbioMarks( int b){
        bioMarks = b;
    }
    public int getchemMarks(){
        return chemMarks;
    }
    public int getbioMarks(){
        return bioMarks;
    }
    public int getphyMarks(){
        return phyMarks;
    }
    public void display(){
        System.out.println("The physics marks of student are: " + phyMarks + "\n The chemistry marks of student are: " + chemMarks + "\n The biology marks of the student are: " + bioMarks);
    }
    }

    

    