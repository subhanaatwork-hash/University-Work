class date{
    public String month;
    public String year;
    public String day;

    public void displayDate(){
        System.out.println("Date is :  " + day + "-" + month + "-" + year );

    }
}

public class dateDemoLab1Act2{
    public static void main(String [] args){
    date d1 = new date();
    d1.month = "Dec";
    d1.day = "2";
    d1.year = "2009";
    d1.displayDate();

    date d2 = new date();
    d2.month = "Jan";
    d2.day = "23";
    d2.year = "2007";
    d2.displayDate();
    }

}