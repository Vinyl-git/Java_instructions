/*
Napisz program, ktory przyjmuje jako parametr rok z zakresu 1900 - 3000 a nastepnie sprawdza czy rok jest przestepny czy nie.
Jezeli rok jest przestepny to program w konsoli jako wynik powinien wyswietlic slowo "Przestepny".
Jezeli rok nie jest przestepny to program w konsoli jako wynik powinien wyswietlic slowo "Zwykly"

Dla przypomnienia:

Rok jest przestepny, gdy jest podzielny przez 4 i nie jest podzielny przez 100
lub jest podzielny przez 400. Np. 2012, 1996, 2000 to lata przestepne, natomiast 1900, 2001, 1998 nie sa przestepne.

Na przyklad rok 2000 jest przestepny natomiast rok 2100 juz nie jest.
 */

package instructions;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj rok: ");
        int year = sc.nextInt();

        if (year >= 1900 && year <= 3000){
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
                System.out.println("Przestepny");
            } else {
                System.out.println("Zwykly");
            }
        } else {
            System.out.println("Zwykly");
        }
    }
}
