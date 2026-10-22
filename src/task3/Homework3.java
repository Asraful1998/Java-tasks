
package task3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 400 == 0 ||
                (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is a non-leap year.");
        }

        input.close();
    }
}
