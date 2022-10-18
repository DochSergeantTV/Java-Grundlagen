import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[]{0,1,2,3,4,5,6,7,8,9}));
        System.out.println(Arrays.toString(getDigitCount(-121456890)));
    }



    public static int[] getDigitCount(int n){
        int[] rückgabe = new int[10];

        if (n <= 0){
            n *= -1;
        }

        String werte = String.valueOf(n);
        String[] buffer = werte.split("");

        for (int i = 0; i < 10; i++){
            int anzahl = 0;

            for (int j = 0; j < buffer.length; j++){
                if(String.valueOf(i).equals(buffer[j])){
                    anzahl++;
                }

            }

            rückgabe[i] = anzahl;
        }

        //System.out.println(Arrays.toString(buffer));
        return rückgabe;
    }
}