package de.fhac.java;

public class BruchObjekt {

    private double zähler;
    private double nenner;
    private double erhöhung;

    public void setZähler(double zähler){
        this.zähler = zähler;
    }
    public void setNenner(double nenner){
        this.nenner = nenner;
    }
    public void setErhöhung(double erhöhung){
        this.erhöhung = erhöhung;
    }

    public double getBruch() {
        return this.zähler/ this.nenner + this.erhöhung;
    }
}

