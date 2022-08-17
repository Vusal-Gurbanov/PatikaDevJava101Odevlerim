# PatikaDevJava 101 Odevleri.
--------
[PatikadDev](www.patika.dev)
------------------------------------
## 
-1.[Odev DeersNotu:](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#1-odev-ders-notu-hesaplama-if-kullanmadan)
-2.[Odev KDV Hesaplama:](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#2-odev-kdv-hesaplama) [3. Odev Üçken Hipotenus Hesaplama:](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#3-odev--ucken-hipotenus-hesaplama)   [4. Odev Taksi Metre:](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim#4odev-taksi-metre) [5.Odev Dairenin Yarı Çapını hesaplama:](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#5-odev-dairenin-yar%C4%B1-%C3%A7ap%C4%B1n%C4%B1-hesaplama)
[6. Market kasa](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim#6-odev-market-kasa)
-----------------------------------------

### 1. Odev Ders notu hesaplama if kullanmadan.
```
 import java.util.Scanner;
public class NotHesaplama {
    public static void main(String[] args) {
        //değişkenler oluşturuyoruz.
        int mat, fiz, tarih, kim, turkce, muzik;

        //Skaner sinifini tamamladik
        Scanner inp = new Scanner(System.in);

        //Hocadan ders notlarını  alalım.
        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fiz = inp.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kim = inp.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = inp.nextInt();
        // Not ortalamasını buluyoruz.
        int toplam = (mat + fiz + tarih + kim + tarih + turkce + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Deers Not Ortalamanız: " + sonuc);
         //gecdi, gecmedi kontrol ediyoruz if kulanmadan.
        boolean gecti= sonuc<=60;
        String str= gecti ? "Tebrikler gectiniz":"Malesef calismak lazm! ";
         System.out.println(str);}
    
```
[Geri Dön ](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#patikadevjava-101-odevleri)
-------------------------------------------------------------------------------------

### 2. Odev KDV hesaplama.

``` java.
{import java.sql.SQLOutput;
import java.util.Scanner;
public class KDVhesaplama {
    public static void main(String[] args) {
         double urunTutari, kdvOran = 0.18, kdvTutar, kdvliTutar;

         Scanner input = new Scanner(System.in);
         System.out.print("ürün tutarını giriniz: ");
         urunTutari = input.nextDouble();

         kdvTutar = urunTutari * kdvOran;
         kdvliTutar = urunTutari + kdvTutar;

        System.out.println("KDV siz tutar:" + urunTutari);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV' li tutar : " + kdvliTutar);  

```
[Geri Dön ](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#patikadevjava-101-odevleri)
----------------------------------------------------------------------------------------
### 3. Odev  Ucken Hipotenus Hesaplama
```
import java.util.Scanner;
public class OgrenciNotHesaplama {
    public static void main(String[] args) {
        //değişkenler oluşturuyoruz.
        int mat, fiz, tarih, kim, turkce, muzik;

        //Skaner sinifini tamamladik
        Scanner inp = new Scanner(System.in);

        //Hocadan ders notlarını  alalım.
        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fiz = inp.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kim = inp.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        muzik = inp.nextInt();
        // Not ortalamasını buluyoruz.
        int toplam = (mat + fiz + tarih + kim + tarih + turkce + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Deers Not Ortalamanız: " + sonuc);
        //gecdi, gecmedi kontrol ediyoruz if kulanmadan.
        boolean gecti= sonuc<=60;
        String str= gecti ? "Tebrikler gectiniz":"Malesef calismak lazm! ";
        System.out.println(str);
    }
}
```
[Geri Dön ](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#patikadevjava-101-odevleri)
-----------------------------------------------------------------------------------
### 4.Odev Taksi Metre.
```
package Odevler;
import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
       // Kulanacağımız değişkenleri tanımlıyoruz.
        int km;
        double perKlm=2.5, total, startPice =10;

        // Kulanıcıdan değer alıyoruz.
        Scanner input= new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        //Kulanıcıdan aldığımız değeri KM ye carpalım ve sonucla başlangıc ücreti tplayalım.
        total = (km * perKlm);
        total += startPice;
         // ve  son, indi bindi icin koşul tanımlayalım.
        total= (total < 20.0) ? 20 : total;
        System.out.println("Toplam tutar: " + total);

    }
}
```
[Geri Dön ](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#patikadevjava-101-odevleri)
-------------------------------------------------------------------------------
### 5. Odev Dairenin Yarı Çapını Hesaplama.
```
package Odevler;

import java.util.Scanner;


public class DaireCevreAlani {
    public static void main(String[] args) {
        // değişkenleri tanımlayalım.
        int r;
        double pi = 3.14;

        // kulanıcıdan deger alalım.
        Scanner DaireYariCap = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz: ");
        r = DaireYariCap.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r ;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }

    }
```
[Geri Dön ](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#patikadevjava-101-odevleri)
-----------------------------------------------------------------------------------------------------------------
### 6. Odev Market kasa.
```
package Odevler;

import java.util.Scanner;

 public class ManavKasa {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        
        double armut = 2.14;
        double elma = 3.67;
        double domates= 1.11;
        double muz = 0.95;
        double patlican = 5;

        System.out.println("Armut kac kilo ? :");
        double armutKilo = inp.nextInt();
        double toplamArmut = armut * armutKilo;

        System.out.println("Elma kac kilo ? :");
        double elmaKilo = inp.nextInt();
        double toplamElma = elma * elmaKilo;

        System.out.println("Domates kac kilo ? :");
        double domatesKilo = inp.nextInt();
        double toplamDomates = domates * domatesKilo;

        System.out.println("Muz kac kilo? :");
        double muzKilo = inp.nextInt();
        double toplamMuz = muz * muzKilo;

        System.out.println("Patlıcan kac kilo ? :");
        double patlicanKilo = inp.nextInt();
        double toplamPatlican = patlican * patlicanKilo;

        double toplamTutar = toplamArmut + toplamElma + toplamDomates + toplamMuz + toplamPatlican;
        System.out.println("Toplam Odemeniz : " + toplamTutar + "TL");


    }


}
```
[Geri Dön ](https://github.com/Vusal-Gurbanov/PatikaDevJava101Odevlerim/blob/main/README.md#patikadevjava-101-odevleri)
-------------------------------------------------------------------------------------------------------------------------------------------------


