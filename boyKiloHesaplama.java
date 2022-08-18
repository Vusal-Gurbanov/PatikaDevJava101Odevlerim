package Odevler;
import java.util.Scanner;
public class boyKiloHesaplama {
    public static void main(String[] args) {
        double boy, kilo, index;

        Scanner BoyKlo = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz: ");
        boy = BoyKlo.nextDouble();

        System.out.println("Kilonuzu giriniz: ");
        kilo = BoyKlo.nextDouble();

        index = kilo / (boy*boy);
        System.out.println("Vücut indexiniz :" + index);
    }
}
