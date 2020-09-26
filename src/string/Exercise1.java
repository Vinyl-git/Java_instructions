/*
Napisz program, ktory pobierze od uzytkownika tekst z konsoli a nastepnie zastapi wszystkie wystapienia licery 'a', litera 'b'
 */

package string;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //utworzyc obiekt scannera
        String userString = userInput.nextLine(); //pobieranie Stringa przez usera
        String newString = userString.toLowerCase().replace('a', 'b'); //zastapic w stringu userString a na b
        System.out.println(newString); //wyswietlic zastapiony tekst
    }
}
