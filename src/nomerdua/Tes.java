package nomerdua;

public class Tes {

    public static void main(String[] args) {
        // Membuat objek Truk
        Truk truk1 = createTruk(4, "kuning", "solar", 1500, 1000);
        Truk truk2 = createTruk(6, "merah", "solar", 2000, 5000);

        // Membuat objek Taksi
        Taksi taksi1 = createTaksi(4, "oranye", "bensin", 1500, 10000, 5000);
        Taksi taksi2 = createTaksi(4, "biru", "bensin", 1300, 7000, 3500);

        // Membuat objek Sepeda
        Sepeda sepeda1 = createSepeda(3, "hitam", "1", 2);
        Sepeda sepeda2 = createSepeda(2, "putih", "2", 5);

        // Menampilkan data kendaraan
        tampilkanDataKendaraan("Truk1", truk1);
        tampilkanDataKendaraan("Truk2", truk2);
        tampilkanDataKendaraan("Taksi1", taksi1);
        tampilkanDataKendaraan("Taksi2", taksi2);
        tampilkanDataKendaraan("Sepeda1", sepeda1);
        tampilkanDataKendaraan("Sepeda2", sepeda2);
    }

    // Helper method untuk membuat objek Truk
    public static Truk createTruk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMaks) {
        Truk truk = new Truk();
        truk.setJmlRoda(jmlRoda);
        truk.setWarna(warna);
        truk.setBahanBakar(bahanBakar);
        truk.setKapasitasMesin(kapasitasMesin);
        truk.setMuatanMaks(muatanMaks);
        return truk;
    }

    // Helper method untuk membuat objek Taksi
    public static Taksi createTaksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm) {
        Taksi taksi = new Taksi();
        taksi.setJmlRoda(jmlRoda);
        taksi.setWarna(warna);
        taksi.setBahanBakar(bahanBakar);
        taksi.setKapasitasMesin(kapasitasMesin);
        taksi.setTarifAwal(tarifAwal);
        taksi.setTarifPerKm(tarifPerKm);
        return taksi;
    }

    // Helper method untuk membuat objek Sepeda
    public static Sepeda createSepeda(int jmlRoda, String warna, String jmlSadel, int jmlGir) {
        Sepeda sepeda = new Sepeda();
        sepeda.setJmlRoda(jmlRoda);
        sepeda.setWarna(warna);
        sepeda.setJmlSadel(jmlSadel);
        sepeda.setJmlGir(jmlGir);
        return sepeda;
    }

    // Helper method untuk menampilkan data kendaraan
    public static void tampilkanDataKendaraan(String jenis, Kendaraan kendaraan) {
        if (kendaraan instanceof Truk) {
            Truk truk = (Truk) kendaraan;
            System.out.println(jenis + ": " + truk.getJmlRoda() + " roda, " + truk.getWarna() +
                    ", bahan bakar: " + truk.getBahanBakar() + ", kapasitas mesin: " + truk.getKapasitasMesin() +
                    ", muatan maks: " + truk.getMuatanMaks());
        } else if (kendaraan instanceof Taksi) {
            Taksi taksi = (Taksi) kendaraan;
            System.out.println(jenis + ": " + taksi.getJmlRoda() + " roda, " + taksi.getWarna() +
                    ", bahan bakar: " + taksi.getBahanBakar() + ", kapasitas mesin: " + taksi.getKapasitasMesin() +
                    ", tarif awal: " + taksi.getTarifAwal() + ", tarif per km: " + taksi.getTarifPerKm());
        } else if (kendaraan instanceof Sepeda) {
            Sepeda sepeda = (Sepeda) kendaraan;
            System.out.println(jenis + ": " + sepeda.getJmlRoda() + " roda, " + sepeda.getWarna() +
                    ", jumlah sadel: " + sepeda.getJmlSadel() + ", jumlah gir: " + sepeda.getJmlGir());
        }
    }
}
