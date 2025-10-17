package methodquestion;

import java.util.Scanner;


public class bankprogrm {

     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //declare variable
        Scanner scanner = new Scanner(System.in);
        double balance = 100.50;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            //display menu
            System.out.println("B-A-N-K-I-N-G");
            System.out.println("Show balance ");
            System.out.println("Deposit ");
            System.out.println("Withdraw ");
            System.out.println("Exit ");

            System.out.println("------------------------");

            System.out.println("Enter ur choice (1-4) : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = balance += deposit();
                case 3 -> balance = balance -= wtihdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.print("invalid choice");

            }


        }
        System.out.println("------------THANK YOU FOR BANKING WITH US-------------------");
        //get and process userschoice
        //show balance()
        //deposit
        //withdraw
        //exit
    }
    static void showBalance(double balance){
        System.out.println("-----------------");
            System.out.println(" ");
        System.out.printf("$%2f" ,balance);
            System.out.println(" ");



    }
    static double deposit(){
       double amount;

        System.out.print("Enter an amount to be deposited" );
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("amount cannt be zero");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double wtihdraw(double balance){
        double amount;
        System.out.println("Enter the money withdrawing ?? ");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("insuffficient fund ");
            return 0;
        } else if (amount < 0) {
            System.out.println("ammount cannt be neg -");
            return 0;

        }else{
            return amount;
        }

    }
}
