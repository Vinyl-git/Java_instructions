
/* Napisz program, który przyjmuje liczbę a nastepnie wyswietla w konsoli "YES",
jezeli jest dodatnia lub "NO", jezeli jest ujemna lub zerowa.
*/


package instructions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");

        int number = userInput.nextInt();

        if (number > 0){
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
