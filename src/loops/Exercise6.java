/*
Napisz program, ktory:

- na samym poczatku zapyta czy chcesz dodac cyfre do wyniku.
- jezeli uzytkownik wpisze znak "y" licznk ma zostac zwiekszony o 1 i wyswietlony aktualny wynik.
- jezeli uzytkownik wpisze znak "n" program ma wyswietlic wynik i wyswietlic komunikat koniec gry.
- jezeli uzytkownik wpisze jakikolwiek inny znat wtedy ma wyswietlic ponownie pytanie i licznik ma nie zostac zwiekszony
 */

package loops;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userString;
        int score = 0;

        while (true) {
            System.out.println("Czy chcesz zwiekszyc wynik? (Wpisz 'y'): ");
            userString = userInput.nextLine().toLowerCase();
            if (userString.equals("y")) {
                score++;
            }
            else if (userString.equals("n")) {
                System.out.println("Twoj wynik to: " + score);
                System.out.println("Koniec gry!");
                break;
            }
        }
    }
}
