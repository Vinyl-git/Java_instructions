/*
Napisz program, ktory:

- pobierze od uzytkownika liczbe elementow do pobrania,
- pozwoli wpisac taka sama liczbe roznych liczb jak liczba elementow podana wczesniej,
- znajdzie najwyzsza liczbe podzelna przez 4 i wyswietli ja na ekranie sposrod tych liczb.

Liczba elementow do wpisania nie moze byc wieksza niz 1000.
Liczba wprowadzona jako pojedynczy element nie moze byc wieksza niz 30000.
 */

package loops;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int divisibleByFour = 0;

        while (userInput.hasNext()) {
            int num = userInput.nextInt();
            if (num % 4 == 0 && divisibleByFour < num) {
                divisibleByFour = num;
            }
        }
        System.out.println(divisibleByFour);
    }
}
