# PatikaDevJava101Odevlerim
--------
[Patika.dev] (www.patika.dev)
---
## 1.odevim Ders notu hesaplama if kullanmadan.
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
-------------------------------------------------------------------------------------

## 2. Odev KDV hesaplama.

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
----------------------------------------------------------------------------------------
## 3. Odev  Ucken Hipotenus Hesaplama
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
