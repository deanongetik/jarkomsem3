public class Main {
    public static void main(String[] args) {

        Shape kubus = new Shape(5, 5, 5);
        Shape balok = new Shape(10, 5, 5);

        kubus.cetak();
        System.out.println();

        balok.cetak();
        System.out.println();

        double selisihVolume = kubus.compareTo(balok);
        System.out.println("Selisih Volume = " + selisihVolume);
    }
}