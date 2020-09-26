/*
Napisz program, ktory pobierze od uzytkownika tekst oraz poczatek i koniec nowego tekstu a nastepnie wyswietli nowy tekst w konsoli.
 */

package string;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        int start = scanner.nextInt();
        int stop  = scanner.nextInt() + 1;

        System.out.println(userString.substring(start, stop));
    }
}