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

