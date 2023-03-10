package Bab_2.Latihan;

class Bank{
    private int saldo;

    Bank(int saldo){
        this.saldo = saldo;
    }

    void welcome(){
        System.out.println("Selamat Datang di Bank ABC");
    }

    void simpanUang(int saldo){
        this.saldo += saldo;
        System.out.println("Simpan uang: Rp. " + saldo);
    }

    void ambilUang(int saldo){
        if (saldo <= this.saldo){
        this.saldo -= saldo;
        System.out.println("Ambil uang: Rp. " + saldo);
        }else{
            System.out.println("Mohon maaf saldo anta tidak mencukupi");
        }
    }

    public void getSaldo() {
        System.out.println("Saldo saat ini: Rp." + this.saldo);
    }
}

public class BankBeraksi {
    public static void main(String[] args) {
        Bank rekeningku = new Bank(100000);
        rekeningku.welcome();
        rekeningku.getSaldo();
        rekeningku.simpanUang(500000);
        rekeningku.getSaldo();
        rekeningku.ambilUang(150000);
        rekeningku.getSaldo();
    }
}
