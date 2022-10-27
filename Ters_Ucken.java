package kosul_ifadeleri;
import java.util.Scanner;

public class Ters_Ucken {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        int n=klavye.nextInt();

        for(int i=0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * n - 1; k >= (2 * i + 1); k--) {
                System.out.print("*");

            }
            System.out.println();




        /*
        int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=10; 0<i; i--) {//Döngümüzün ne kadar döneceğini belirtir.
            for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
            }
            for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
                System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
                System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
            }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }

         */
        }

    }
}
