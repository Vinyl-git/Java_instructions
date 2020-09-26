/*
Stwórz klasę o nazwie Book. Stworzona klasa ma zawierać trzy pola:
- pole string o nazwie title,
- pole int o nazwie yearOfPublishing
- pole boolean o nazwie isAvailable
Następnie stwórz w klasie Exercise1 trzy wybrane przez Ciebie książki.

 */

package obj;

class Book {
    String title;
    int yearOfPublishing;
    boolean isAvailable;
}

public class Exercise1 {
    public static void main(String[] args) {
        Book negotiate = new Book();
        negotiate.title = "Negotiate";
        negotiate.yearOfPublishing = 2012;
        negotiate.isAvailable = true;

        Book ninjaAttack = new Book();
        ninjaAttack.title = "Ninja Attack";
        ninjaAttack.yearOfPublishing = 1999;
        ninjaAttack.isAvailable = false;

        Book startCode = new Book();
        startCode.title = "Start to Code";
        startCode.yearOfPublishing = 2020;
        startCode.isAvailable = false;
    }
}
