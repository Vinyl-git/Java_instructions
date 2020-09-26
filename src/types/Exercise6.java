/*
Napisz program, który sprawdzi czy wprowadzona wartość w konsoli
jest mniejsza niż 20 i większa niż 0.
Program na koniec powinien wyświetlić wartość true lub false.
*/

package types;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        boolean result = number < 20 && number > 0;

        System.out.println(result);
    }
}
