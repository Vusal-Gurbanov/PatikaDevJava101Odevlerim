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

