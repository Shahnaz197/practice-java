import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randomNumWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //random object to generate random number

        int guess;
        int attempt = 0;
        int min = 1;
        int max =100;
        int randomNum = random.nextInt(min,max+1);

        System.out.println("welcome to number guessing game ");
        System.out.printf("guess a number between %d-%d:\n",min,max);


        do{
            System.out.println("Enter a guess ");
            guess = scanner.nextInt();
            attempt++;
            if(guess< randomNum){
                System.out.println("too low try again");
            } else if (guess > randomNum) {
                System.out.println("too high");
            }else {
                System.out.println(" CORRECT  " +randomNum);
                System.out.println(" # attempts " + attempt);

            }

        }while(guess != randomNum);

        System.out.println("you have won ");




    }
}
