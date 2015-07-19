package homewor_00;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andrey_PC on 19.07.15.
 */
public class Main
{
    public static void main(String[] args)
    {
        int n;


        do {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter the number: ");
                n = scanner.nextInt();

                if (n % 3 == 0) {
                    System.out.println("Number " + n + " share on 3.");
                } else {
                    System.out.println(String.format("Number %d doesn't share on 3.", n));
                }
                break;
            } catch (Exception e) {
                System.err.println("It's not number. Error. Try again: " + e);

            }
        } while (true);

    }
}
