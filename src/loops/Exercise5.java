/*
Napisz program, ktory bedzie przyjmowal znak nastepnie pytal uzytkownika czy chce wyjsc z gry.
Jezeli uzytkownik wpisze znak q wtedy ma zostac wyswietlony komunikat "Gra wylaczona"
Jezeli uzytkownik wpiszze inny znak, ma sie pojawic ponownie pytanie czy chce wyjsc z gry.
 */

package loops;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        boolean quit = true;
        String userChar;

        while (quit) {
            System.out.println("Czy chcesz wyjsc z gry? (wpisz 'q', aby wyjsc.)");
            userChar = userInput.next();
            if (userChar.equals("q")) {
                quit = false;
            }
        }
    }
}
