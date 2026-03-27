/*Create a class Account class with balance as data member. Create two constructors
 (no argument, and two arguments) and methods to withdraw and deposit balance.*/

import java.util.Scanner;
class Account{
    private double balance;
    Scanner sc = new Scanner(System.in);
    public Account(){ // no arg constructor
        balance = 0;
    }
    public Account( double b){
        balance = b;
        
    }
   
    public void  withdraw( double w){
        System.out.println("Enter the amount withdrawn:");
        w = sc.nextDouble();
        balance = balance - w;
        
    }
    public void deposit( double d){
        System.out.println("Enter the amount deposited:");
        d = sc.nextInt();
        balance = balance + d;
    }

    public void display(){
        System.out.println("The balance is:" + balance);
    }
    }

    public class RunnerLab2Task2{
        public static void main(String [] args){
            Account a1 = new Account();
            a1.display();
            Account a2 = new Account(1000);
            a2.display();
        }
    }