
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Point p = new Point(10, 12);
        System.out.println(p);

        Complex c = new Complex(10, 12);
        System.out.println(c);

        EvenNumber e = new EvenNumber(11);
        System.out.println(e);

        try {
            Grade g = new Grade(1.0f);
            System.out.println(g);
        } catch (IllegalArgumentException exception) {
            System.out.println("Versuchs nochmal mit ner neuen Zahl");
        }

        Birthday b = new Birthday(28, 2);
        System.out.println(b);

        Domino d = new Domino(0, 6);
        System.out.println(d);
    }
}
