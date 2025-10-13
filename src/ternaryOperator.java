package src.src;

public class ternaryOperator {
    public static void main(String[] args) {
/*
        int score = 55;
        String passOrFail=(score>=60) ? "pass":"fail";
        System.out.println(passOrFail);

        int hours = 13;
        String timeOfDay =(hours<12) ? "A.M":"P.M";
        System.out.println(timeOfDay);

        int income = 5000;
        double taxRate = (income >= 1000) ?0.25:0.5;
        System.out.println(taxRate);


 */
        double price = 100;
        boolean isMember = true;
        double finalPrice = isMember ?price*0.5:price;
        System.out.println(finalPrice);
    }
}
