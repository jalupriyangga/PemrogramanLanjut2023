package Bab_1.Latihan;

class Mahasiswa2 {
    String nama;
    String nim;
    String prodi;
    int umur;

    Mahasiswa2(String N, String M, String P, int U) {
        nama = N;
        nim = M;
        prodi = P;
        umur = U;
    }

    void cetakData()
    {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Prodi   : " + prodi);
        System.out.println("Umur    : " + umur);
    }
}
