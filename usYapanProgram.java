import java.util.Scanner;
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

public class usYapanProgram {
    static int power(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        int temel= inp.nextInt();
        System.out.println("Üs olacak sayı: ");
        int uss= inp.nextInt();

        int sonuc=1;
        for (int i=1;i<=uss;i++){
            sonuc*=temel;
            if (uss==0){
                return 1;
            }

        }
        System.out.println("Cevab:"+sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        power();
    }
}
/*
*
*
* */