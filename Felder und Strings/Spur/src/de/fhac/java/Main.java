package de.fhac.java;

public class Main {

    public static void main(String[] args) {
        double[][] x = new double[2][2];
        x[0][0] = 2;
        x[0][1] = 10;
        x[1][0] = 2;
        x[1][1] = 10;
        System.out.println(getTrace(x));
    }

    public static double getTrace(double[][] matrix){
        double sum = 0;
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (i == j){
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}
