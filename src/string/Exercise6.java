/*
Napisz program, ktorypobierze od uzytkownika piec slow a nastepnie wyswietli je jako jeden tekst w konsoli
 */

package string;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String firWord = userInput.next();
        String secWord = userInput.next();
        String thiWord = userInput.next();
        String fourWord = userInput.next();
        String fifWord = userInput.next();

        String fullSentence = firWord + secWord + thiWord + fourWord + fifWord;

        System.out.println(fullSentence);
    }
}
