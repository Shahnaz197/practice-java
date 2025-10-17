import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
 /*       for(int i = 1;i<=9;i++){
   *         System.out.print(i+ " ");
    *    }
        System.out.println();
        for(int i = 1;i<=9;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        for(int i = 1;i<=9;i++){
            System.out.print(i+ " ");
        }


        for(int i =1;i<=3;i++){
            for(int j =1;j <=9;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

  */
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.println("Enter the number of rows ; ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of column ; ");
        columns = scanner.nextInt();
        System.out.println("Enter the number of symol ; ");
        symbol = scanner.next().charAt(0);


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
