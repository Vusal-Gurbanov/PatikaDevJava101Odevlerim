package kosul_ifadeleri;
import java.util.Scanner;
public class ZodiakCinSitchCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz: ");
        int yil = inp.nextInt();
        int kalan = yil % 12;


        switch (kalan) {
            case 0:
                System.out.println("Cin Zodyagi Burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Cin Zodyagi Burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Cin Zodyagi Burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Cin Zodyagi Burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Cin Zodyagi Burcunuz: Fare");
                break;
            case 5:
                System.out.println("Cin Zodyagi Burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Cin Zodyagi Burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Cin Zodyagi Burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Cin Zodyagi Burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Cin Zodyagi Burcunuz: Yilan");
                break;
            case 10:
                System.out.println("Cin Zodyagi Burcunuz: At");
                break;
            case 11:
                System.out.println("Cin Zodyagi Burcunuz: Koyun");
                break;
        }
    }
}
