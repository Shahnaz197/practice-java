package Arrays;

//array where it useful to store matrix of data here each eement is an array


public class TwoDArray {
    public static void main(String[] args) {

        String[] fruits={"apple","orange","kiwi"};
        String[] vegetables={"potato","carrot","leaks"};
        String[] meats ={"chicken","beef","shrimp"};
        //for acces or change element


        String[][] groceries ={fruits,vegetables,meats};
        groceries[0][0]="pumpkin";

        for(String[] foods :groceries){
            for(String food:foods){
                System.out.print(food+" ");
            }
            System.out.println(); //printing food will give u memory address cause arryas are reference datatype
        }

    }

}
