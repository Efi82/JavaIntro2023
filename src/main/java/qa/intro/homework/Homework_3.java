package qa.intro.homework;

import java.util.Scanner;

public class Homework_3 {





    /* Домашно 3:
    4. Напишете програма/ метод, която чете число от 1 до 7 в конзолата
    и на базата на това изписва в конзолата деня от седмицата във формат:
    You have selected 1. Day of the week is Monday. */

    public static void main(String[] args) {

        System.out.println("Please, enter a number from 1 to 7");

        Scanner in = new Scanner(System.in);

        int weekDay = in.nextInt();

        switch (weekDay) {

            case 1:
                System.out.println("You have selected 1. Day of week is Monday.\n");
                        break;
            case 2:
                System.out.println("You have selected 2. Day of week is Tuesday.\n");
                break;
            case 3:
                System.out.println("You have selected 3. Day of week is Wednesday.\n");
                break;
            case 4:
                System.out.println("You have selected 4. Day of week is Thursday.\n");
                break;
            case 5:
                System.out.println("You have selected 5. Day of week is Friday.\n");
                break;
            case 6:
                System.out.println("You have selected 6. Day of week is Saturday.\n");
                break;
            case 7:
                System.out.println("You have selected 7. Day of week is Sunday.\n");
                break;
            default:
                System.out.println("You have submitted invalid number.\n");
        }


        

        /* 2. Напишете програма/ метод, която чете число и изписва в конзолата дали числото е четно или не?*/

        System.out.println("Please, write a number to see if it is odd or even\n");

        byte newNum = new Scanner(System.in).nextByte();

        System.out.println("You have selected" + " " + newNum);

        if ( newNum % 2 == 0 )
            System.out.println(newNum + " is an even number.");
        else
            System.out.println(newNum + " is an odd number.");

        }
    }
