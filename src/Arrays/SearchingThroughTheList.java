package Arrays;

import java.util.Scanner;

public class SearchingThroughTheList {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int [] num ={1,12,3,60};
        String[] name = {"rose","peter","ara"};
        boolean isFound =false;
        String targets;
        System.out.println("enter a name");
        targets = scanner.nextLine();


        int target = 152;


        for(int i =0;i < name.length;i++){
            if(name[i].equals(targets)){
                System.out.println("Element found at index " + i );
                isFound =true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in this array ");
        }
/*
        for(int i =0;i < num.length;i++){
            if(target == num[i]){
                System.out.println("Element found at index " + i );
                isFound =true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in this array ");
        }
*/

    }
}
