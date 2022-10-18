package de.fhac.java;

public class Main {

    public static void main(String[] args) {
	Bruch b1 = new Bruch(1, 3);


    Bruch b2 = b1;

    Bruch b3 = new Bruch(b1);

    if (b1 == b2){
        System.out.println("b1 == b2");
    }else System.out.println("b1 =! b2");

    if (b1 == b3){
        System.out.println("b1 == b3");
    }else System.out.println("b1 =! b3");

    if (b2 == b3){
        System.out.println("b2 == b3");
    }else System.out.println("b2 =! b3");

    if(b1.equals(b2)){
        System.out.println("b1.equals(b2)");
    }else System.out.println("b1 nicht equals b2");

    if(b1.equals(b3)){
        System.out.println("b1.equals(b3)");
    }else System.out.println("b1 nicht equals b3");

    if(b2.equals(b3)){
        System.out.println("b2.equals(b3)");
    }else System.out.println("b2 nicht equals b3");

    }
}
