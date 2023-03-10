package Bab_1.Latihan;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Mahasiswa MhsTI1 = new Mahasiswa();
        MhsTI1.nama = "Dionisius Arito";
        MhsTI1.nim = "225150701111032";
        MhsTI1.prodi = "Teknologi Informasi";
        MhsTI1.umur = 17;

        System.out.println("Data Mahasiswa: ");
        System.out.println("Nama    : " + MhsTI1.nama);
        System.out.println("NIM     : " + MhsTI1.nim);
        System.out.println("Prodi   : " + MhsTI1.prodi);
        System.out.println("Umur    : " + MhsTI1.umur);
        System.out.println("\nData Mahasiswa: ");
        MhsTI1.cekData();
    }
}
