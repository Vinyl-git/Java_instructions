/*
Napisz program, który sprawdzi czy wprowadzona wartość w konsoli jest mniejsza niż 10.
Kod do pobierania liczby z konsoli przez użytkownika jest już zaimplementowany.
Program na koniec powinien wyświetlić wartość true lub false.
 */

package types;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int givenNumber = userInput.nextInt();
        boolean isLess = givenNumber < 10;
        System.out.println(isLess);
    }

}
