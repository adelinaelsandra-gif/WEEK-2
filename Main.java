    public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop Asus", "85.00000", 10, Asus, 2);
        Elektronik hp = new Elektronik("HP Samsung, "320000", 25, 1");
        Makanan indomie = new Makanan("Indomie Goremg", 3500, 1000, "Mie Instan", "2026-12-01");
        Makanan roti = new Makanan("Roti Tawar", 8000, 100, "Roti", "2026-04-30");

        // Overriding - satu nama method untuk semua
        System.out.println("===== DAFTAR PRODUK =====");
        laptop.tampilkanInfo();
        hp.tampilkanInfo();
        indomie.tampilkanInfo();
        roti.tampilkanInfo();

        System.out.println("===== RINCIAN PAJAK ELEKTRONIK =====");
}
        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitungTotalHarga(1);
        System.out.println("Laptop x1 (PPN standar 11%)");
        System.out.println(" Subtotal : Rp" + laptop.hitungTotalHarga(1));
        System.out.println(" Pajak    : Rp" + pajakLaptop);
        System.out.println(" Total    : Rp" + totalLaptop);

        double pajakHpCustom = hp.hitungPajak(2);
        System.out.println("HP Samsung x2 (pajak custom 5%)");
        System.out.println(" Subtotal : Rp" + hp.hitungTotalHarga(2));
        System.out.println(" Pajak    : Rp" + pajakHpCustom);
        System.out.println(" Total    : Rp" + (hp.hitungTotalHarga(2) + pajakHpCustom));
        }

