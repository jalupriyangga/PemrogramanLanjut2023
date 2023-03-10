package Bab_2.Latihan;

class Cubes{
    int panjang;
    int lebar;
    int tinggi;

    Cubes(){
        this.panjang = this.lebar = this.tinggi = 0;
    }

    Cubes(int P, int L, int T){
        this.panjang = P;
        this.lebar = L;
        this.tinggi = T;
    }

    Cubes(int P){
        this.panjang = this.lebar = this.tinggi = P;
    }

    void info(){
        System.out.println("Panjang = " + panjang);
        System.out.println("Lebar = " + lebar);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Volume = " + panjang*lebar*tinggi);
        System.out.println("Luas = " + ((2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi)) + "\n");
    }
}

public class CubesBeraksi {
    public static void main(String[] args) {
        Cubes myBox1 = new Cubes();
        myBox1.panjang = 5;
        myBox1.lebar = 10;
        myBox1.tinggi =12;
        Cubes myBox2 = new Cubes(10,6,4);
        Cubes myBox3 = new Cubes(10);
        myBox1.info();
        myBox2.info();
        myBox3.info();
    }
}
