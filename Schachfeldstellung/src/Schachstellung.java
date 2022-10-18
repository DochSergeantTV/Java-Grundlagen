import java.lang.invoke.SwitchPoint;
import java.util.Arrays;

public class Schachstellung {

    String[][] Schachfeld = new String[17][33];
    public Schachstellung() {

        String[] typ1 = {"+", "-", "-", "-","+", "-", "-", "-","+", "-", "-", "-","+", "-", "-", "-","+", "-", "-", "-","+", "-", "-", "-","+", "-", "-", "-","+", "-", "-", "-","+"};
        String[] typ2 =  {"|", " "," ", " ","|"," ", " ", " ","|"," ", " ", " ","|"," ", " ", " ","|"," ", " ", " ","|", " "," ", " ","|"," ", " ", " ","|", " "," ", " ", "|"};

        for(int y = 0; y < 16; y++){
            if((y%2)==0) {
                for (int i = 0; i < typ1.length; i++){
                    Schachfeld[y][i] = typ1[i];
                }
            } else{
                for (int i = 0; i < typ2.length; i++){
                    Schachfeld[y][i] = typ2[i];
                }
            }

        }
        for (int i = 0; i < typ1.length; i++){
            Schachfeld[16][i] = typ1[i];
        }

    }

    public void setzeSchachstellung(String s) {
        int x = s.length() / 3;
        for (int i = 0; i<x; i++ ){
            String test = s.substring(i*3,i*3+3);

            String figur = String.valueOf(test.charAt(0));

            String zeile = String.valueOf(test.charAt(1));
            String spalte = String.valueOf(test.charAt(2));

            int zeilennummer = Integer.parseInt(zeile);
            int spaltennummer = Integer.parseInt(spalte);

            Schachfeld[zeilennummer*2-1][spaltennummer*4-2] = figur;
        }

    }

    public String toString() {
        String uebergabe = "";


        for(int i = 0; i<Schachfeld.length ; i++){
            for(int y = 0; y< Schachfeld[i].length; y++){
                uebergabe += Schachfeld[i][y];
            }
            uebergabe += "\n";
        }
        return uebergabe;

    }

}
