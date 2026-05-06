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

    public void setKadaluarsa(int kadaluarsa) {
        if (kadaluarsa < 0) {
            System.out.println("Masa Expired Tidak Boleh Negatif");
        } else {
            this.kadaluarsa = kadaluarsa;
        }
    }

    public void setExpired(int expired, String type) {
        if (type.equals("Nasi")) {
            if (expired > 4) {
                System.out.println("Masa Expired Tidak Boleh Negatif");
            } else {
                this.expired = expired;
            }
        } else {
            if (expired < 2) {
                System.out.println("Masa Expired Tidak Boleh Negatif");
            } else {
                this.expired = expired;
            }
        }
    }

}






    
    
