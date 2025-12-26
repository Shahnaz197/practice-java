package Miniprojects;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaper {
    public static void main(String[] args) {

        //rock - paper game

        //declare variable
        Scanner scanner =new Scanner(System.in);
        Random random=new Random();
        String[] choices ={"rock","paper","Scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain ="yes";

        do{
            System.out.println("Enter your move (rock,paper,scissor)");
            playerChoice = scanner.nextLine().toLowerCase(Locale.ROOT);

//get choice from user
            if(!playerChoice.equals("rock")
                    &&!playerChoice.equals("paper")
                    &&!playerChoice.equals("scissor")){
                System.out.println("Invalid choice");
                continue;
            }
            //get random choice for the computer

            computerChoice =choices[random.nextInt(3)];
            System.out.println("computer choice " + computerChoice);

            //check win condition

            if(playerChoice.equals(computerChoice)){
                System.out.println("It s A tie ");
            } else if (

                        (playerChoice.equals("rock")&&computerChoice.equals("scissor"))||
                        (playerChoice.equals("paper")&&computerChoice.equals("rock"))||
                        (playerChoice.equals("scissor")&&computerChoice.equals("paper"))

            ){
                        System.out.println("Its a win");

            }else{
                        System.out.println("u lose");
            }

                        System.out.println("do u want to play again [ YES or NO ]");
                        playAgain = scanner.nextLine().toLowerCase();
        }while (playAgain.equals("yes"));

                        System.out.println("thank u for playing");

    }
}
