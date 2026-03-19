import java.util.Scanner;

/*
 * Name: Darrien Raines-Boswell
 * Date of Development: 03/18/2026
 * Assignment: SDC230 Performance Assessment - Smallest Number
 * Description: This program asks the user how many integers they want to enter,
 * then loops through those integers and determines the smallest value entered.
 */

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Darrien Raines-Boswell - Week 2 PA Smallest Number");
        System.out.println();
        System.out.println("Finding the Smallest Value:");

        System.out.print("How many integers would you like to enter: ");
        int count = input.nextInt();

        System.out.print("Enter an integer value: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter an integer value: ");
            int number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The smallest value entered is: " + smallest);

        input.close();
    }
}