/*
Napisz program, ktory:
- jako pierwsza liczbe przyjmuje ilosc liczb, ktore musza zostac wpisane do programu
- nastepnie wpisac ilosc zadeklarowanych wczesniej liczb w konsoli
- wyswietli wszystkie wpisane liczby
- liczby podzielne przez 8 zsumuje i wyswietli na koncu jako liczbe calkowita
 */

package loops;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int iterator = sc.nextInt();
        int nextNum;
        int sumOfNums = 0;

        for (int i = 0; i < iterator; i++) {
            nextNum = sc.nextInt();
            if (nextNum % 6 == 0) {
                sumOfNums = sumOfNums + nextNum;
            }
        }
        System.out.println(sumOfNums);
    }
}
