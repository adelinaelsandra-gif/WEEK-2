//- Superclass--------------------------------------
//- Subclass 1: Elektronik----------------------------
//- Subclass 2: Makanan------------------------------
class Makanan extends Produk {
    private String kadaluarsa;
    private String kategori;

    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
        this.kategori = kategori;
    }

    public String getKadaluarsa(){
        return kadaluarsa;
    }

    public String getKategori(){
        return kategori;
    }







    
    public void tampikanData(){
        super.tampilkanInfo();
        System.out.println("Masa expired: " + "Hari");

    }

    public void setExpired(int expired){
        if(expired <= 0){
            System.out.println("Masa Expired Tidak Boleh Negatif");
        }else{
            this.expired = expired;
        }
    }
}
