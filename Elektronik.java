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

    @Override
    public void tampilkanInfo(){
        System.out.println("Elektronik");
        super.tampilkanInfo();
        System.out.println("Masa garansi: " + "Hari");

    }

    public void setGaransi(int garansi){
        if(garansi < 0){
            System.out.println("Masa garansi Tidak Boleh Negatif");
        }else{
            this.garansi = garansi;
        }
    }
}

