package exercises;

import java.util.Scanner;

public class Drive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");

        Integer miles = input.nextInt();

        System.out.println("How much gas have you consumed?");

        Integer gas = input.nextInt();

        input.close();

        int mpg =   miles/gas;


        System.out.println("your miles per gallon is: " + mpg);
    }
}
