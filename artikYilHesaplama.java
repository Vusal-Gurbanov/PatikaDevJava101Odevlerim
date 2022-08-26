package kosul_ifadeleri;
import java.util.Scanner;
public class artikYilHesaplama {
    public static void main(String[] args) {

        int artik0, artik4, year,girilen;

        Scanner inp = new Scanner(System.in);
        System.out.println("Yil giriniz: ");
        year = inp.nextInt();


        artik0 = year % 400;
        artik4 = year % 4;



        if ((artik0 == 0) || (artik4 == 0)) {
            System.out.println( year+ ": arti yildir.");
        } else {
            System.out.println( year + ": yil arti yil degil.");
        }


    }
}
