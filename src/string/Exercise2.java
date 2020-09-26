/*
Napisz program, ktory pobierze od uzytkownika nazwe miasta a nastepnie sprawdzi czy na koncu wystapi koncowka -burg

Output:
Ausburg >> true
Oslo >> false
 */

package string;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        System.out.println(city.endsWith("burg"));
    }
}
