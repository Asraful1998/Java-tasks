
package task2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours, minutes, and seconds: ");
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();

        s++;

        if (s == 60) {
            s = 0;
            m++;
        }

        if (m == 60) {
            m = 0;
            h++;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.printf("Time one second later: %02d:%02d:%02d%n",
                h, m, s);

        input.close();
    }
}
