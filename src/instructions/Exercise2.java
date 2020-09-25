/*
Napisz program, ktory przyjmuje liczby A, B orac C jako glugosci bokow trojkata,
 a nastepnie sprawdza czy trojkat z wymienionymi bokami moglby istniec.

 Warunki istnienia trojkata:
 1. A + B > C
 2. A + C > B
 3. B + C > A
 */

package instructions;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b + c > a && c + a > b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
