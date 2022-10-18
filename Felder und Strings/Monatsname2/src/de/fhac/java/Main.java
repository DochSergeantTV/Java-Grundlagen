package de.fhac.java;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNameOfMonth(10));
    }

    public static String getNameOfMonth(int no){
        String[] Monate = new String[]{"", "J", "F", "Mae", "A", "Ma", "Jun", "Jul", "A", "S", "O", "N", "D"};
        return Monate[no];
    }
}
