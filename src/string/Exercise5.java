/*
Napisz program, ktory pobierze od uzytkownika tekst a nastepnie sprawi, ze caly tekst wyswietli sie malymi literami.
 */

package string;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String userString = userInput.nextLine();
        System.out.println(userString.toLowerCase());
    }
}
