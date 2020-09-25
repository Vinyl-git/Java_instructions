/*
Napisz program, ktory  przyjmuje jako parametr liczbe a nastepnie wyswietla na ekranie "True",
jezeli liczba znajduje sie w przedziale (-15,12)u(14,17)u(19,+∞).
Jezeli liczba nie jest w przedziale to wyswietla wartosc "False".

Okragle nawiasy - nie zalicza sie do zakresu
Kwadratowe nawiasy - zalicza sie do zakresu
 */

package instructions;


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int num = sc.nextInt();
        String positive = "True";
        String negative = "False";

        if (num > -15 && num <= 12){
            System.out.println(positive);
        }
        else if (num > 14 && num < 17){
            System.out.println(positive);
        }
        else if (num >= 19){
            System.out.println(positive);
        }
        else{
            System.out.println(negative);
        }
    }
}
