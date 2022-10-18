import java.util.Scanner;
public class armstrongSayiBulma {
    public static void main(String[] args) {

         /*Ödev
        Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        Örnek : 1643 = 1 + 6 + 4 + 3 = 14*/

        int basamak,
                basamakTop=0;

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int num = scan.nextInt();

        while (num!=0){

            basamak=num%10;
            basamakTop+=basamak;
            num/=10;}

        System.out.println(basamakTop);



        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int num = scanner.nextInt();
        int  originalNumber, remainder, result = 0;

        originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " GİRİLEN SAYI ARMSTRONG SAYIDIR");
        else
            System.out.println(num + " GİRİLEN SAYI ARMSTRONG SAYI DEGİL");

         */





    }
}
