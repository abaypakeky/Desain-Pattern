
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Buku", 100000);
        produk1.setStrategiDiskon(new DiskonPersen(10)); // Diskon 10%

        Produk produk2 = new Produk("Pakaian", 200000);
        produk2.setStrategiDiskon(new DiskonPotongan(50000)); // Potongan Rp 50.000

        System.out.println(produk1);
        System.out.println(produk2);
    }
}

