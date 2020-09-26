/*
Napisz program, ktory:
- przejmuje wiek
-pyta czy posiada zgode rodzicow
-pyta czy pracuje w sluzbie mundurowej
-pyta czy posiada kategorie A2 co najmniej 2 lata

nastepnie jako wynik wyswietla jaka kategorie prawa jazdy nna motor jestes w stanie uzyskac.

Kategoria AM - 14 lat
Kategoria A1 - 16 lat + zgoda rodzicow lub 18 lat
Kategoria A2 - 18 lat
Kategoria A - 24 lata lub 20 lat + posiadanie A2 co najmniej 2 lata lub 18 lat mundurowka
 */

package instructions;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Podaj wiek: ");
        int age = userInput.nextInt();

        System.out.println("Czy posiadasz zgode rodzicow? (true/false)");
        boolean parentsPermission = userInput.nextBoolean();

        System.out.println("Czy pracujesz w sluzbie mundurowej? (true/false)");
        boolean workInMilitary = userInput.nextBoolean();

        System.out.println("Czy posiadasz kategorie A2 co najmniej dwa lata? (true/false)");
        boolean categoryA2For2Years = userInput.nextBoolean();

        if (age >= 24 || (age >= 20 && categoryA2For2Years) || (age >= 18 && workInMilitary)) {
            System.out.println("Jestes w stanie uzyskac kategorie A");
    }
    else if (age >= 18) {
        System.out.println("Jestes w stanie uzyskac kategorie A2");
        }
    else if (age >= 16 && parentsPermission) {
        System.out.println("Jestes w stanie uzyskac kategorie A1");
        }
    else if (age >= 14) {
        System.out.println("Jestes w stanie uzyskac kategorie AM");
        }
    else {
        System.out.println("Nie jestes w stanie uzyskac zadnej kategorii");
        }
    }
}
