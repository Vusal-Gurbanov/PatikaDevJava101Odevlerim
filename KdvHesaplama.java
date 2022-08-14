package Odevler;

import java.sql.SQLOutput;
import java.util.Scanner;
public class KdvHesaplama {
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




    }
}
