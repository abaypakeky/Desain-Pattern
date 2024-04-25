//Interface Diskon
interface Diskon {
    double hitungDiskon(double hargaAwal);
}

//Implementasi Strategy (Diskon)
class DiskonPersen implements Diskon {
    private final double persenDiskon;

    public DiskonPersen(double persenDiskon) {
        this.persenDiskon = persenDiskon;
    }

    @Override
    public double hitungDiskon(double hargaAwal) {
        return hargaAwal * persenDiskon / 100;
    }
}

class DiskonPotongan implements Diskon {
    private final double potonganHarga;

    public DiskonPotongan(double potonganHarga) {
        this.potonganHarga = potonganHarga;
    }

    @Override
    public double hitungDiskon(double hargaAwal) {
        return Math.max(0, hargaAwal - potonganHarga);
    }
}

//Kelas Produk
class Produk {
    private String nama;
    private double hargaAwal;
    private Diskon strategiDiskon;

    public Produk(String nama, double hargaAwal) {
        this.nama = nama;
        this.hargaAwal = hargaAwal;
    }

    public void setStrategiDiskon(Diskon strategiDiskon) {
        this.strategiDiskon = strategiDiskon;
    }

    public double hitungHargaAkhir() {
        return hargaAwal - strategiDiskon.hitungDiskon(hargaAwal);
    }

    @Override
    public String toString() {
        return String.format("%s (Harga Awal: %.2f, Harga Akhir: %.2f)", nama, hargaAwal, hitungHargaAkhir());
    }
}