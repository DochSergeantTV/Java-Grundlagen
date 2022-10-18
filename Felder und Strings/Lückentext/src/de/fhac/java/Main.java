package de.fhac.java;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println(cloze("Was_ist_das"));
    }
    public static String cloze(String s){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (((i +1) % 4) == 0){
                text.append(" ");
            } else {
                text.append(s.charAt(i));
            }
        }
        return text.toString();
    }
}
