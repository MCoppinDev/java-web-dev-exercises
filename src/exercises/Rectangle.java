package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input length of rectangle");

        Integer length = input.nextInt();

        System.out.println("Input width of rectangle");

        Integer width = input.nextInt();

        input.close();

        int area = length * width;


        System.out.println("The area of your rectangle is: " + area);



    }

}
