package src.src;

import java.util.Scanner;

public class enhancedSwitch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a day of the week ");
        String day = scanner.nextLine().toLowerCase();

        switch(day){
            case"Monday","Tuesday","Wednesday","Thursday" ->
                    System.out.println("it is is m");
            default -> System.out.println(day +"is not a day");

        }
    }
}
