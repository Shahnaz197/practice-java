package src.src;

import java.util.Scanner;

public class circleQue {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        double area;
        int r;
        double circumference ;
        double volume;

        System.out.println("radius of circle ? ");
        r = scanner.nextInt();

        area = Math.PI*Math.pow(r,2);
        circumference = 2*Math.PI*r;
        volume = (4.0/3.0) * Math.PI*Math.pow(r,3);

        System.out.printf("Area of the circle is  = %.1f" , + area);
        System.out.println("Circumference of the circle is  = \n" + circumference);
        System.out.println("Volume of the circle is  = \n" + volume);

    }

}
