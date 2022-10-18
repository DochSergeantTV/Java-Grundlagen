package de.fhac.java;

public class Domino {
    private int vorderseite;
    private int rueckseite;

    public Domino (int vorderseite, int rueckseite){
        setRueckseite(rueckseite);
        setVorderseite(vorderseite);
    }

    public void setRueckseite(int rueckseite) {
        if (rueckseite < 0 || rueckseite > 6){
            throw new IllegalArgumentException("Rückseite ist nicht im Zahlenbereich");
        }
        else this.rueckseite = rueckseite;
    }

    public void setVorderseite(int vorderseite) {
        if (vorderseite < 0 || vorderseite > 6){
            throw new IllegalArgumentException("Vorderseite ist nicht im Zahlenbereich von 0 - 6");
        }
        this.vorderseite = vorderseite;
    }

    public int getRueckseite() {
        return rueckseite;
    }

    public int getVorderseite() {
        return vorderseite;
    }

    @Override
    public String toString() {
        return "Domino{" +
                "vorderseite=" + vorderseite +
                ", rueckseite=" + rueckseite +
                '}';
    }
}
