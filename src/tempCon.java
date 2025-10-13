package src.src;

import java.util.Scanner;
public class tempCon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature ");
        temp = scanner.nextDouble();
        System.out.println(" convert Celcius C to Farenheit F ? ");
        unit = scanner.next().toUpperCase();

       //  condition ? true:false
        newTemp =(unit.equals("C")) ? (temp - 32 )*5 : (temp * 5/9) + 32;

        System.out.println(newTemp);



    }
}
