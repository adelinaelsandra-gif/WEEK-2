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
    
}
