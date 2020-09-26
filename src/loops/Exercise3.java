/*
Napiszprogram, ktory przyjmuje liczbe nastepnie wyswietla liczby podzielne
przez 6 z zakresu 0 >> wpisana piczba a na koncu wyswietla sume liczb podzielnych przez 6.
 */

package loops;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("podaj liczbę: ");

        int countNum = userInput.nextInt();
        int sum = 0;

        for (int i = 1; i <= countNum; i++) {
            if (i % 6 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
