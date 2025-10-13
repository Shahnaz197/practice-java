package src.src;

import java.util.Scanner;
public class weightConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        //declare variable
        // welcome message
        //prompt for user
        //option 1 convert g to kg
        //option 2 convert kg to g
        //else print mot a valid choice

        double weight;
        double newWeight;
        int choice;

        System.out.println("Hi W-E-L-C-O-M-E ");
        System.out.println("1: convert g to kg");
        System.out.println("2: convert kg to g");
        System.out.println("Choose a option");

        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in g ");
            weight = scanner.nextDouble();
            newWeight = weight*0.001;
            System.out.println("the weight in kg : " + newWeight);
        }
        else if(choice == 2){
            System.out.println("Enter the weight in kg ");
            weight = scanner.nextDouble();
            newWeight = weight*1000;
            System.out.println("the weight in g : " + newWeight);
        }
        else{
            System.out.println("your choice is invalid");
        }


    }
}
