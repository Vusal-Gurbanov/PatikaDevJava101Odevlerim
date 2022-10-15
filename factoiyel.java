import java.util.Scanner;
public class factoiyel {
    public static void main(String[] args) {
         /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
    N’in r’li kombinasyonu C(n,r) şeklinde gösterilir. Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */

        Scanner inp = new Scanner(System.in);
        int n, r, fn = 1, fr = 1, fm = 1, combination;

        /*
        fn,n nin faktoriyeli;
        fr,r nin faktoriyeli;
        fm ise n-r nin faktoriyelidir.
         */

        System.out.println("N'nin r kombinasyonu şu şekilde gösterilir C(n,r): .\nLütfen N' değerini giriniz:");
        n = inp.nextInt();
        System.out.println("Lütfen r' değerini giriniz:");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            fn = fn * i;
        }
        for (int k = 1; k <= r; k++) {
            fr = fr * k;
        }
        int minus = n - r;
        for (int m = 1; m <= minus; m++) {
            fm = fm * m;
        }
        combination = fn / (fr * fm);
        System.out.println("Kombinasyon:" + combination);

    }
}
