package src.src;

import java.util.Random;

public class randomNum {
    public static void main(String[]args){
        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,5);
        number2= random.nextInt(1,5);
        number3= random.nextInt(1,5);
        //first number is inclusive last one is exclusive
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
