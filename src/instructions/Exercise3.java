/*
Napisz program, ktory przyjmuje jako parametr liczebnosc wojska a nastepnie klasyfukuje je co do wielkosci:

Ponizej 0 - brak armii
Od 1 do 19 - druzyna
Od 20 do 249 - pluton
Od 250 do 999 - kompania
Powyzej 1000 - batalion
 */

package instructions;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj liczbe zolnierzy: ");


        int troops = sc.nextInt();

        if (troops < 1){
            System.out.println("Brak armii");
        }
        else if (troops <= 19){
            System.out.println("To jest druzyna");
        }
        else if (troops <= 249){
            System.out.println("To jest pluton");
        }
        else if (troops <= 999){
            System.out.println("To jest kompania");
        }
        else {
            System.out.println("To jest Batalion");
        }
    }
}
