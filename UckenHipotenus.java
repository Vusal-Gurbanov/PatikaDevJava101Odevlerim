package Odevler;

import java.util.Scanner;
public class UckenHipotenus {
    public static void Main(String[] args) {
        // Değişkenleri oluşturalım.
        int a, b;
        double c;

        //kulanicidan degerleri alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci kenarı giriniz:");
        a= girdi.nextInt();
        System.out.print("ikinci kenar girin:");
        b=girdi.nextInt();

        //Dik ückende Hipetenüsü bulalım.
        c=Math.sqrt((a*a)+(b*b));
        System.out.print("Hipetenüs: " + c);

            /**
             * Formül
             * Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
             *
             * 𝑢 = (a+b+c) / 2
             *
             * Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
             * */
    }
}
