package de.fhac.java;

public class EvenNumber {
    private int number;

    public EvenNumber(int number){
        setNumber(number);
    }

    public void setNumber(int number) {
        if ((number%2) == 0){
            this.number = number;
        } else this.number = number - 1;

    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return String.valueOf(number);
    }
}
