/*
Napisz program, ktory wyswietla w konsoli liczby od 0 do 4 przy uzyciu petli while i for.
 */

package loops;

public class Exercise1 {
    public static void main(String[] args) {

        //for
        for (int x = 0; x <= 4; x++) {
            System.out.println(x);
        }
        System.out.println();

        //while
        int x = 0;
        while (x <= 4) {
            System.out.println(x);
            x++;
        }
    }
}
