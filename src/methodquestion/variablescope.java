package methodquestion;

public class variablescope {
    public static void main(String[] args) {
        int x =1;
        System.out.println(x);
    }
    static void doSomething(){
        int x = 2; //local variable
    }

}
