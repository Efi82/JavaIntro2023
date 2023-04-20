package qa.intro;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        //Calculate the area of the rectangle

        System.out.println("Please enter length and width of the rectangle:");

        double length, width;

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter width");

        width = sc.nextDouble();

        System.out.println("Enter length");

        length = sc.nextDouble();

        Scanner console = new Scanner(System.in);

        System.out.println("The area of the rectangle is:");

        System.out.println(width * length);

    }
}



