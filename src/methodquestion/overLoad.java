package methodquestion;

public class overLoad {
    public static void main(String[] args) {
        String pizza = bakePizza("flatbread","mozarella","spicy chicken");
        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread + " pizza ";

    }
    static String bakePizza(String bread,String cheese){
        return cheese+" "+bread + " pizza ";

    }
    static String bakePizza(String bread,String cheese,String topping) {
        return cheese + " " + bread + " " + topping + " " + " pizza ";
    }
}

