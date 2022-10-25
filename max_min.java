package kosul_ifadeleri;
import java.util.Scanner;
// Girilen Sayılardan Min ve Max Değerlerini bulan uygulama
public class max_min {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sayi, z, buyukSayi = 0, kucukSayi = 0;

        System.out.println("Lütfen Kac kere sayı gireceginizi  belirtin: ");
        z = inp.nextInt();
                
        for (int i = 1; i <= z; i++) {
            System.out.println("Sayı " + i + ". giriniz:");
            sayi = inp.nextInt();
            if (i == 1) {
                buyukSayi = sayi;
                kucukSayi = sayi;
            } else {
                if (sayi > buyukSayi) {
                    buyukSayi = sayi;
                } else if (sayi < kucukSayi) {
                    kucukSayi = sayi;
                }
            }
        }
        System.out.println("Girdiginiz sayılardan en büyügü: " + buyukSayi);
        System.out.println("Girdiginiz sayılardan en kücügü: " + kucukSayi);
    }
}