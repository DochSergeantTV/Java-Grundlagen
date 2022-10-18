package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        double b[] = {10,2,3,41,1};

        System.out.println(getMinimum(b));
        System.out.println(getMinimumIndex(b));
    }

    public static double getMinimum(double[] a){
        double min = a[0];
        for(int i = 0; i < a.length; i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static int getMinimumIndex(double[] a){
        int minIndex = 0;
        for (int i = 0; i < a.length; i++){
            if(a[minIndex]>a[i]){
                minIndex = i;
            }
        }
        return minIndex;
    }

}
