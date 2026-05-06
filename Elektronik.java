class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public Elektronik(String nama, double harga, int stok, String merek, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }
    public String getMerek() {
        return merek;
    }
    public int getGaransiTahun() {
        return garansiTahun;
    }
// Overiding tampilInfo()- versi elektronik
    @Override
    public void tampilkanInfo(){
        System.out.println("Elektronik");
        System.out.println("Nama   : " + getNama());
        // super.tampilInfo();
        super.tampilkanInfo();
        System.out.println("Merek   : " + merek);
        System.out.println("Garansi: " + garansiTahun + " tahun");
        System.out.println("--------");
    }

    // Overloading hitungPajak()
    // Versi 1 - pajak standar PPN 11%
    public double hitungDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    //Versi 2 - pajak dengan presentase custom
    public double hitungDiskon(int jumlahBeli, double persenPajak) {
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100);
    }

    public double hitungHarga setelahPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.20;
    }
    }


