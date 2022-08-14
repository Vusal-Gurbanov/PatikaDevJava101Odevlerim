package Odevler;

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