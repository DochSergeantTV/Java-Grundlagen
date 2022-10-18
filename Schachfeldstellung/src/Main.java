public class Main {
    public static void main(String[] args) {

        printSchachstellung("b22K24l28B23k66");
        printSchachstellung("K11D22T33S44L55B66");
        printSchachstellung("k81d72t63s54l65b76");

    }
    private static void printSchachstellung(String stellung) {
        Schachstellung s = new Schachstellung();
        s.setzeSchachstellung(stellung);
        System.out.println(s);

    }
}