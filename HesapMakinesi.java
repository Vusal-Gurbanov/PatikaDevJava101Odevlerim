import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, choice;
        //double choice; (not: if yapısı icin.

        System.out.println("Basit hesap makinasi.\nBirinçi değeri giriniz :");
        Scanner entry = new Scanner(System.in);
        n1 = entry.nextInt();

        System.out.println("İkinci değeri giriniz");
        Scanner entry2 = new Scanner(System.in);
        n2 = entry2.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seciniz:\nToplama icin 1 :\nCikarma icin 2 :\nCarpma icin 3 :\nBölme icin 4 :");
        Scanner entrychoice = new Scanner(System.in);
        //choice=entrychoice.nextDouble();
        choice = entrychoice.nextInt();



       /* if (choice==1) {
            System.out.println("Sonuc: " + (n1+n2));}
        else if (choice==2) {
            System.out.println("Sonuc: " + (n1-n2));}
        else if (choice==3) {
            System.out.println("Sonuc: " + (n1*n2));}
        else if (choice==4) {
            System.out.println("Sonuc: " + (n1/n2));}
        else{System.out.println("Yalnis bilgi girdiniz !!!");};
         */

        switch (choice) {
            case 1:
                System.out.println("Sonuc: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Sonuc: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Sonuc: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Sonuc: " + (n1 / n2));
                break;
            default:
                System.out.println("Yalnis secim  yaptiniz. tekrar dogru secim yapiniz!!!");



        }


    }
}



