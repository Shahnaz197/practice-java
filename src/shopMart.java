package src.src;

import java.util.Scanner;

public class shopMart {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        String item;
        float price;
        int quantity;
        double total;
        char currency = '$';


        System.out.println("what item would you like to buy ? : ");
        item = scanner.nextLine();

        System.out.println("what is the price for each :? ");
        price = scanner.nextFloat();

        System.out.println("How many would you like ");
        quantity = scanner.nextInt();

        total = price * quantity;


        System.out.println("\nYou have bought " + quantity + item + "/s");

        System.out.println(" Your total is " + currency + total);
    }
}
