
public class Elektronik extends Produk {
    private int garansi;
    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
    }

    public void tampikanData(){
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

