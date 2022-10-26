package kosul_ifadeleri;
import java.util.Scanner;
public class mukemmelSayi {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int number,total=0;
        System.out.println("Sayi giriniz:");
        number= inp.nextInt();
        if (number<0){
            System.out.println("Lütfen pozitif sayıları girin.");
        } else {
            for (int i=1;i<number;i++){
                if (number%i==0){
                    total+=i;
                }
            }
            if (total==number){
                System.out.println(number+" mükemmel sayıdır.");
            }else {
                System.out.println(number+" tam sayı değildir.");
            }
        }

    }
}
