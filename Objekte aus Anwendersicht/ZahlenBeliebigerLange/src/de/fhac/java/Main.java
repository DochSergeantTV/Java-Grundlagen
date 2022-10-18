package de.fhac.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        BigInteger fakultät = new BigInteger("1");

        for (int i = 1; i <= zahl; ++i) {
            fakultät = fakultät.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fakultät);
    }
}
