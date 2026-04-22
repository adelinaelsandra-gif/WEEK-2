package Base;

public class Produk {
    private String nama;
    String kategori;
    protected double harga;
    public int stok;

    public Produk (String nama, double harga, int stok, String kategori){
    this.nama = nama;
    this.kategori = kategori;
    this.harga = harga; 
    this.stok = stok;
    }

    publicStrung getNama(){
    }
        return nama;

        public double getHarga(){
            return harga;

        publicint getstok(){
                return stok
            }
        }
    public void tampilkanInfo(){
        System.out.println("Produk: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("-------------");

    }
}
