package src.src;

import java.util.Random;

public class headTail {
    public static void main(String[] args){
        Random random = new Random();

        boolean isHead;

        isHead = random.nextBoolean();

        if(isHead){
            System.out.println("HEADS");
        }
        else{
            System.out.println("T-A-I-L");
        }

        System.out.println(isHead);
    }
}
