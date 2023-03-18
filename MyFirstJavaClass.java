package qa.intro;

import java.util.Scanner;

public class MyFirstJavaClass {
    public static void main(String[] args) {

    System.out.println("Hello, stranger!");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter your name:");

    String userName = scanner.nextLine();

    System.out.println("Welcome, " + userName + "!");

    System.out.println("What are your hobbies and interests" + "?");

    String userAnswer = scanner.nextLine();

    System.out.println("Great hobby you have" + "!");

    }
}
