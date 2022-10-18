package de.fhac.java;

public class Complex {
    private double t1;
    private double t2;

    public Complex(double t1, double t2){
        sett1(t1);
        sett2(t2);
    }
    public void sett1(double t1){
        this.t1 = t1;
    }
    public void sett2(double t2) {
        this.t2 = t2;
    }

    public double gett1() {
        return t1;
    }

    public double gett2() {
        return t2;
    }

    public String toString(){
        return t1 + "+ i*(" + t2 + ")";
    }
}
