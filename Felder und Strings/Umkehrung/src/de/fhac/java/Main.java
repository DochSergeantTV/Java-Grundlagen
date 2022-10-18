package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverse("Wasistdas"));
    }
    public static String reverse(String s){
        StringBuilder Rückgabe = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            Rückgabe.append(s.charAt(i));
        }
        return Rückgabe.toString();
    }

}
