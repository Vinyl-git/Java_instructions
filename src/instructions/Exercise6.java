/*
Napisz program, ktory przejmuje liczbe a jako wynik wyswietla czy wprowadzana liczba jest parzysta czy nie.
 */

package instructions;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Wprowadz liczbe naturalna: ");

        int giveNumber = num.nextInt();

        if (giveNumber % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        }
        else {
            System.out.println("Liczba jest nieparzysta.");
        }
    }
}