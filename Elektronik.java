
public class Elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;


    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
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

