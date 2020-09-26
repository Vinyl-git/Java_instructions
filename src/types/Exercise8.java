/*
Napisz program, który przyjmuje trzy liczby całkowite i zwraca wartość true
w momencie suma dwóch z trzech liczb wyniesie 20.
Program na koniec powinien wyświetlić wartość true lub false.
*/

package types;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner userNumber = new Scanner(System.in);

        int correctNumber = 20;
        int firstNumber = userNumber.nextInt();
        int secondNumber = userNumber.nextInt();
        int thirdNumber = userNumber.nextInt();

        boolean result = firstNumber + secondNumber == correctNumber ||
                secondNumber + thirdNumber == correctNumber ||
                firstNumber + thirdNumber == correctNumber;

        System.out.println(result);
    }
}
