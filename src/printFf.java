package src.src;

public class printFf {
    public static void main(String[]args){
        //this is for formatting the output


        String name = "koko";
        char firstLetter = 'K';
        int age = 10;
        double height = 20.5;
        boolean isEmployed = false;
/*specifier character
        System.out.printf("hey amazing %s\n",name);
        System.out.printf("so your name starts with %c\n",firstLetter);
        System.out.printf("you are age %d\n",age);
        System.out.printf("you are this %f\n",height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old \n",name,age);

 */
/*precision
        double price1 =9.99;
        double price2 = 100.15;
        double price3= -54.01;

        System.out.printf("%f\n",price1);
        System.out.printf("%.0f\n",price2);
        System.out.printf("%f\n",price3);
// flags

        System.out.printf("%,f\n",price1);
        System.out.printf("%.0f\n",price2);
        System.out.printf("%+f\n",price3);

 */
//width
        int id1 =1;
        int id2 =23;
        int id3 =456;
        int id4 =7890;

        System.out.printf("%04d\n",id1);
        System.out.printf("%04d\n",id2);
        System.out.printf("%04d\n",id3);
        System.out.printf("%04d\n",id4);

    }
}
