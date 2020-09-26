/*
Napisz program, ktory przyjmuje liczbe nastepnie wyswietla liczby parzyste od 0 do wpisanej liczby.
 */

package loops;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int userNumber = userInput.nextInt();

        for (int x = 1; x <= userNumber; x++) {
            if (x % 2 != 1) {
                System.out.println(x);
            }
        }
    }
}
