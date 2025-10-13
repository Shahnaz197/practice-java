package src.src;

import java.util.Scanner;

public class iF {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;

        System.out.println("whats your name");
        name = scanner.nextLine();
        System.out.println("Enter you age : ");
        age = scanner.nextInt();

        System.out.println("are you an student ? ( true / false )");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name (❁´◡`❁)🤗");
        }
        else{
            System.out.println("Hey " + name + " welcome  (❁´◡`❁)🤗 ");
        }


        //GROUP 2
         if(age >= 18){
             System.out.println("you are an adult");
         }
         else if(age >= 65){
             System.out.println("you ara a senior");
        }
         else if(age <0 ){
             System.out.println("you are not born yet");
         }
         else{
             System.out.println("you are a child");
         }

         //GROUP 3
        if(isStudent){
            System.out.println("you are a student ");

        }
        else{
            System.out.println("you are not a student");
        }

//order of the else if conditions very carefully cause they iterate
    }
}
