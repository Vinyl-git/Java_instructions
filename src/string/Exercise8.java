/*
Napisz program, ktory pobierze od uzytkownika slowo i sprawdzi czy zaczyna sie od malej litery j.
Program w konsoli powinien wyswietlic wartosc true lub false.
 */

package string;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wpisz wyraz: ");

        String givenChar = userInput.next().substring(0, 1);
        String char_j = "j";

        boolean isEqual = givenChar.equals(char_j);
        System.out.println(isEqual);
    }
}
