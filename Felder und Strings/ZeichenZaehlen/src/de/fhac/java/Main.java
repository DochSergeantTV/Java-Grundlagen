package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        System.out.println(getCharCount("chilldac", 'c'));
    }

    public static int getCharCount(String s, char c){
        int zähler = 0;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                zähler++;
            }
        }
        return zähler;
    }

}
