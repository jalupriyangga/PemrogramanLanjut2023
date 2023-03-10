package Bab_1.Tugas;
import java.util.*;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        //Cerita pengantar / narasi
        System.out.println("Kamu punya handphone baru yang bisa digunakan untuk SMS dan panggilan telepon selama pulsa tersedia");

        //Inisiasi objek
        Handphone teleponKu = new Handphone();
        Scanner input = new Scanner(System.in);
        System.out.println("Berikan handphonemu nama perangkat!");
        System.out.print("Nama : ");
        String merk = input.next();
        teleponKu.hidupkan(merk);

        //pilihan menu
        byte pilihMenu;
        do {
            teleponKu.menu();
            pilihMenu = input.nextByte();
            switch (pilihMenu) {
                case 1 -> teleponKu.cekPulsa();
                case 2 -> teleponKu.isiPulsa();
                case 3 -> {
                    System.out.print("Siapa yang ingin kamu panggil? ");
                    String keSiapa = input.next();
                    teleponKu.lakukanPanggilan(keSiapa);
                }
                case 4 -> {
                    System.out.print("Siapa yang ingin kamu panggil? ");
                    String keSiapa = input.next();
                    teleponKu.kirimSMS(keSiapa);
                }
                case 5 -> {
                    teleponKu.matikan(false);
                    System.exit(1);
                }
                default -> System.out.println("Mohon pilih dengan benar!");
            }

        }while (pilihMenu > 0 && pilihMenu <= 5);
    }
}

