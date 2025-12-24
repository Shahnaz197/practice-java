package Arrays;

public class firstSection {
    public static void main(String[] args) {
        //array can store more than one element  inthe sense a vairbale
        String[]  fruit = {"orange","banana","grape","pepper"};
        System.out.println(fruit[2]);
        fruit[2] = "pineapple";
        int numOfFruit = fruit.length;//length is access modifier
        System.out.println(numOfFruit);
        for(int i=0;i<fruit.length;i++){
            System.out.println(fruit[i]);
        }

        /*
        System.out.println(numOfFruit);
        System.out.println(fruit[2]);
        System.out.println(fruit);
        this will print a memory address [Ljava.lang.String;@65ab7765
         arrays are reference data type

         */
    }
}
