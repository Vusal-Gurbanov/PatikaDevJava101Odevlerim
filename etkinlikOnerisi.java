package kosul_ifadeleri;
import java.util.Scanner;
public class etkimlikOnerisi {
    public static void main(String[] args) {
        Scanner secim= new Scanner(System.in);

        int sicaklik;

        System.out.println("Sicaklik araligini aşagidaki secimlerden seciniz:\nSicaklik 5 derecenin altindaysa 1:\nSicaklik 5  ve 15 derece araligindaysa 2:\nSicaklik 15 ve 25 araligindaysa 3:\nSicaklik 25 derecenin ustundeyse 4:\nSeciminiz ?: ");
        sicaklik=secim.nextInt();
        switch (sicaklik){
            case 1:
                System.out.println("Kayak yapa bilirsiniz: ");
                break;
            case 2:
                System.out.println("Sinemaya gide bilirsiniz: ");
                break;
            case 3:
                System.out.println("Piknige gide bilirsiniz: ");
                break;
            case 4:
                System.out.println("Yuzmege gide bilir siniz: ");
                break;
            default:
                System.out.println("Yalnis Bilgi girdiniz, tekrar deneyiniz: ");


        }

    }
}
