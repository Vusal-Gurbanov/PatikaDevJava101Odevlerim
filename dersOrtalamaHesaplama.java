package kosul_ifadeleri;
import java.util.Scanner;
public class dersOrtalamaHesaplama {
    public static void main(String[] args) {

        int mat, turkce, fizik, kimya, muzik, toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notu giriniz: ");
        mat = inp.nextInt();
        if ((mat>=5) && (mat<=100))
            toplam+=mat;
        else {
            System.out.println("Yalnıs bilgi girdiniz. kontrol edin tekrar başdan giriniz!!!");
        }

        System.out.println("Turkce notunu giriniz:");
        turkce = inp.nextInt();
        if ((turkce>=5) && (turkce<=100))
            toplam+=turkce;
        else {
            System.out.println("Yalnıs bilgi girdiniz. kontrol edin tekrar başdan giriniz!!!");
        }

        System.out.println("Fisik notu giriniz:");
        fizik = inp.nextInt();
        if ((fizik>=5) && (fizik<=100))
            toplam+=fizik;
        else {
            System.out.println("Yalnıs bilgi girdiniz. kontrol edin tekrar başdan giriniz!!!");
        }

        System.out.println("Kimya notunu giriniz:");
        kimya=inp.nextInt();
        if ((kimya>=5) && (kimya<=100))
            toplam+=kimya;
        else {
            System.out.println("Yalnıs bilgi girdiniz. kontrol edin tekrar başdan giriniz!!!");

        }

        System.out.println("Muzik notu giriniz:");
        muzik=inp.nextInt();
        if ((muzik>=5)&&(muzik<=100))
            toplam+=muzik;
        else {
            System.out.println("Yalnıs bilgi girdiniz. kontrol edin tekrar başdan giriniz!!!");
        }
        double sonuc=toplam/5;
        if (sonuc>=70)
            System.out.println("Tebrikler sınıfı gecdiniz. ");
        else {
            System.out.println("Daha siki calismak lazim.");
        }










    }
}
