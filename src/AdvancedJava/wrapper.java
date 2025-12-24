package AdvancedJava;

public class wrapper {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble =5.99;
        Character symbol = 'A';

        String myString = myInt.toString();
        System.out.println(myString.length());


        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(symbol.charValue());

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(symbol);

    }
}
