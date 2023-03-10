package Tugas1;
import java.util.*;
class bidangDatar {

    double keliling;
    double luas;
    double panjangDiagonal;

    // membuat scanner
    Scanner input = new Scanner(System.in);

    void hitungLuasLingkaran() {
        System.out.print("Masukkan nilai radius: ");
        double radius = input.nextDouble();
        final double phi = Math.PI;
        luas = (phi * radius * radius);
        System.out.printf("Hasil: %.2f" ,luas);
        System.out.println();
    }

    //void hitungKelilingLingkaran(double radius){
//        final double phi = 3.1415;
//        keliling = phi * 2 * radius;
//        System.out.println(keliling);
//}
    void hitungLuasPersegi() {
        System.out.print("Masukkan panjang sisi: ");
        double panjangSisi = input.nextDouble();
        keliling = panjangSisi * 4;
        luas = panjangSisi * panjangSisi;
        panjangDiagonal = Math.pow((Math.pow(panjangSisi, 2) + Math.pow(panjangSisi, 2)), 0.5);
        System.out.println("Hasil: " + luas);
        System.out.println("Hasil: " + keliling);
        System.out.printf("Hasil: %.2f", panjangDiagonal);
        System.out.println();
    }
}


public class Main{
    public static void main(String[] args) {

        // membuat object bangun datar yaitu lingkaran dan persegi
        bidangDatar lingkaran = new bidangDatar();
        bidangDatar persegi = new bidangDatar();

        // ini nomor 1
        System.out.println("1. Menghitung Luas lingkaran");
        lingkaran.hitungLuasLingkaran();

        // ini nomor 2
        System.out.println("2. Buatlah sebuah program untuk menghitung keliling, luas, dan panjang diagonal dari sebuah segiempat");
        persegi.hitungLuasPersegi();

    }
}

