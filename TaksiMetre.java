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
