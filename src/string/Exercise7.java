/*
Napisz program, ktory pobierze od uzytkownika dwa zdania i sprawdzi czy zdania sa takie sami.
 */

package string;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Wprowadz pierwsze zdanie: ");
        String firstSentence = userInput.nextLine();

        System.out.println("Wprowadz drugie zdanie: ");
        String secondSentence = userInput.nextLine();

        boolean isSame = firstSentence.equalsIgnoreCase(secondSentence);
        System.out.println(isSame);
    }
}
