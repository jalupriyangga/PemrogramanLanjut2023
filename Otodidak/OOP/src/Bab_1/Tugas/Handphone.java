package Bab_1.Tugas;
import java.util.*;

public class Handphone {
    Scanner input = new Scanner(System.in);
    private boolean hidupkan = true;
    private  double pulsaAwal = 100000;
    private double jumlahPulsa = pulsaAwal;

    void hidupkan(String merkmu){
        if (hidupkan == true) {
            System.out.println("Handphone " + merkmu + " dihidupkan...");
        }
    }
    void lakukanPanggilan(String keSiapa){
        if (hidupkan == true) {
            if (jumlahPulsa > 0) {
                System.out.println("Kring, kring, kring... panggilan ke "+ keSiapa + " dilakukan");
            }
        }
        cekPulsa();
    }
    void kirimSMS(String keSiapa){
        if (hidupkan == true) {
            if (jumlahPulsa > 0) {
                System.out.println("dung, dung... sms ke " + keSiapa +"berhasil terkirim");
            }
        }
        cekPulsa();
    }
    void matikan(boolean kematian){
        hidupkan = kematian;
        if (hidupkan == false){
        System.out.println("Handphone mati...");
        }
    }
    void isiPulsa(){
        System.out.println("Mau isi berapa? ");
        int isiPulse =  input.nextInt();
        jumlahPulsa += isiPulse;
        System.out.println("Transaksi berhasil...");
        cekPulsa();
    }
    void cekPulsa(){
        System.out.println("Sisa pulsa kamu adalah " + jumlahPulsa + "\n");
    }

    void menu(){
        System.out.println("MENU");
        System.out.println("1. Cek Pulsa");
        System.out.println("2. Beli Pulsa");
        System.out.println("3. Panggilan");
        System.out.println("4. Kirim SMS");
        System.out.println("5. Matikan");
        System.out.print("Pilih menu: ");
    }
}
