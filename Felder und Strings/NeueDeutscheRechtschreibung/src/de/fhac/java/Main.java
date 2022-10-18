package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(newGermanOrthography("Neue deutsche Rechtschreibung Sch"));
    }
    public static String newGermanOrthography(String s){
        StringBuilder a = new StringBuilder(s.split("")[0]);
        for (int i = 1; i < s.split("").length; i++){
            if (!((s.charAt(i - 1) == 'S' || s.charAt(i - 1)== 's') && s.charAt(i+1) == 'h')){
                a.append(s.split("")[i]);
            }
        }
        return a.toString();
    }
}
