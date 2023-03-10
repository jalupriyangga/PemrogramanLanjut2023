package Bab_2.Latihan;

public class Mobil {
    String warna;
    int tahunProduksi;

    //konstruktor
    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public void info(){
        System.out.println("Warna: " + warna);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}
