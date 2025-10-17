package methodquestion;

public class squareRoot {
    public static void main(String[] args) {
    /*
        double result = square(3);
        double cube_result =cube(5);
        System.out.println(result);
        System.out.println(cube_result);
        String Fullname = getFullname("sponge","bob");
        System.out.println(Fullname);
        //System.out.println( square(3));
    }
    static double square(double number){return number * number;}
    static double cube(double number){return number*number*number;}
    static  String   getFullname(String first,String last){return first + " " + last;}
    */
         int age = 18;

         if(ageCheck(age)){
             System.out.println("you may sign up ");
         }
         else{
             System.out.println("you must be 18+ to sign up");
         }

    }
    static boolean ageCheck(int age){
        if(age >=18){
            return true;
        }else{
            return false;
        }
    }


}
