package de.fhac.java;
/**
 * Repräsentiert einen Bruch mit Integer-Werten als Zähler und Nenner.
 * Invariante: Der Bruch ist immer gekürzt. Der Nenner ist immer größer als 0.
 *
 * @author H. Pflug, RZ, RWTH Aachen
 */
public class Bruch {

    // Attribute
    private int zaehler;
    private int nenner;

    /**
     * Erzeugt einen Bruch mit dem gegebenen Zähler und Nenner.
     *
     * @param zaehler der Zähler des Bruchs
     * @param nenner  der Nenner des Bruchs
     * @throws ArithmeticException falls der Nenner gleich 0 ist.
     */

    public Bruch(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new ArithmeticException("Nenner gleich 0");
        }
        this.zaehler = zaehler;
        this.nenner = nenner;
        normalisiere();
    }

    /**
     * Initialisiert den Bruch mit einem String des Formats \<zaehler\>/\<nenner\>.
     *
     * @param bruch der String im Format \<zaehler\>/\<nenner\>.
     * @throws NumberFormatException falls das Format nicht stimmt.
     * @throws ArithmeticException   falls der Nenner 0 ist.
     */
    public Bruch(String bruch) {
        String[] b = bruch.split("/");
        if (b.length != 2) {
            throw new NumberFormatException("Format muss zaehler/nenner sein");
        }
        this.zaehler = Integer.parseInt(b[0]);
        setNenner(Integer.parseInt(b[1]));

    }


    /**
     * Erzeugt eine Kopie (Klon) des übergebenen Bruchs (Copy-Konstruktor).
     *
     * @param r der Bruch, der geklont werden soll.
     */
    public Bruch(Bruch r) {
        this.zaehler = r.zaehler;
        this.nenner = r.nenner;
    }

    /**
     * Setzt den Nenner des Bruchs.
     *
     * @param nenner der Nenner des Bruchs.
     * @throws ArithmeticException falls der Nenner 0 ist.
     */

    public void setNenner(int nenner) {
        if (nenner != 0) {
            this.nenner = nenner;
            normalisiere();
        } else {
            throw new ArithmeticException("Nenner gleich 0");
        }
    }

    /**
     * Gibt den Nenner des Bruchs zurück.
     *
     * @return der Nenner des Bruchs.
     */
    public int getNenner() {
        return this.nenner;
    }

    /**
     * Setzt den Zähler des Bruchs.
     *
     * @param zaehler der Zähler des Bruchs.
     */
    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
        normalisiere();
    }

    /**
     * Gibt den Zähler des Bruchs zurück.
     *
     * @return der Zähler des Bruchs.
     */
    public int getZaehler() {
        return this.zaehler;
    }

    /**
     * Gibt den Wert des Bruchs als double-Wert zurück.
     *
     * @return der Wert des Bruchs als double-Wert.
     */
    public double getDoubleWert() {
        // Casten in double fuer Fliesskomma-Division
        return this.zaehler / (double) this.nenner;
    }

    /**
     * Multipliziert den Bruch mit dem angegebenen Faktor.
     *
     * @param faktor der Faktor, mit dem der Bruch multipliziert wird.
     */
    public void mult(int faktor) {
        this.zaehler = this.zaehler * faktor;
        normalisiere();
    }

    /**
     * Multipliziert den Bruch mit dem übergebenen Bruch.
     *
     * @param r der Bruch, mit dem multipliziert werden soll.
     */
    public void mult(Bruch r) {
        this.zaehler = this.zaehler * r.zaehler;
        this.nenner = this.nenner * r.nenner;
        normalisiere();
    }

    /**
     * Addiert den übergebenen Bruch.
     *
     * @param b der zu addierende Bruch
     */
    public void add(Bruch b) {
        this.zaehler = this.zaehler * b.nenner + this.nenner * b.zaehler;
        this.nenner = this.nenner * b.nenner;
        normalisiere();
    }

    /**
     * Invertiert den Bruch.
     *
     * @throws ArithmeticException falls der Zähler 0 war.
     */
    public void inverse() {
        int temp = this.zaehler;
        if (temp == 0) {
            throw new ArithmeticException("Nenner gleich 0");
        }
        this.zaehler = this.nenner;
        this.nenner = temp;
        normalisiere();
    }

    /**
     * Gibt die Inverse des Bruchs zurück.
     *
     * @return die Inverse des Bruchs.
     * @throws ArithmeticException falls der Zähler 0 war.
     */
    public Bruch getInverse() {
        Bruch b = new Bruch(this);
        b.inverse();
        return b;
    }

    /**
     * Gibt String in der Form Zähler/Nenner zurück.
     */
    public String toString() {
        return zaehler + "/" + nenner;
    }

    /**
     * Gibt zurück, ob die Zähler und Nenner zweier Brüche gleich sind.
     */
    public boolean equals(Object o) {
        if (o instanceof Bruch) {
            Bruch b = (Bruch) o;
            if (this.zaehler == b.zaehler && this.nenner == b.nenner) {
                return true;
            }
        }
        return false;
    }

    private void normalisiere() {
        if (nenner < 0) {
            nenner = -nenner;
            zaehler = -zaehler;
        }
        // Bruch kuerzen
        if (zaehler == 0) {
            nenner = 1;
        } else {
            int a = zaehler;
            int b = nenner;
            if (a < 0) {
                a = -a;
            }
            // Suchen des groessten gemeinsamen Teilers
            // Euklidischer Algorithmus
            while (b != 0) {
                int h = a % b;
                a = b;
                b = h;
            }
            // a ist jetzt der groesste gemeinsame Teiler
            zaehler = zaehler / a;
            nenner = nenner / a;
        }
    }

} 
