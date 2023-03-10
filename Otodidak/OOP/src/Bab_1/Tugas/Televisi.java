package Bab_1.Tugas;

class television{
        private boolean kehidupan;
        private int channel = 1;
        private int volume = 50;

        television(boolean kehidupan, int channel, int volume){
        this.kehidupan = kehidupan;
        this.channel = channel;
        this.volume = volume;
        }

        void hidupkan(){
            this.kehidupan = true;
            if (kehidupan){
                System.out.println("Televisi Hidup");
            } else {
                System.out.println("Televisi Mati.. Hzhzhzhz...");
            }
            System.out.println("Channel Aktif = " + this.channel + ". Volume = " + this.volume);
        }

        void upChannel(){
            this.channel++;
            System.out.println("Anda sekarang menonton channel 2");
        }

        void upVolume(int volumeNaik){
            this.volume += volumeNaik;
            System.out.println("Volume naik menjadi " + this.volume);
        }

        void GantiChannel(int gantiChannel){
            this.channel = gantiChannel;
            System.out.println("Anda sekarang menonton Channel " + this.channel);
        }

        void matikan(){
            this.kehidupan = false;
            if (kehidupan){
                System.out.println("Televisi Hidup");
            } else {
                System.out.println("Televisi Mati.. Hzhzhzhz...");
            }
        }
}

public class Televisi {
    public static void main(String[] args) {
        television tvKu = new television(true,1,50);
        tvKu.hidupkan();
        tvKu.upChannel();
        tvKu.upVolume(10);
        tvKu.GantiChannel(7);
        tvKu.matikan();
    }
}

