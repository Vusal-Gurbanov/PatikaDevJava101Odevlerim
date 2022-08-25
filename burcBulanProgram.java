package kosul_ifadeleri;
import java.util.Scanner;
public class burcBulanProgram {
    public static void main(String[] args) {

        //"Switch le calışma:"

         int mounth,day;
         String burc= "";
         boolean isError=false;

         Scanner inp= new Scanner(System.in);

         System.out.println("Dogdugunuz ayi giriniz: ");
         mounth=inp.nextInt();

         System.out.println("Dogumdugunuz gün igriniz: ");
         day=inp.nextInt();

         switch (mounth) {
         case 1:
         if (day >= 1 && day <= 31) {
         if (day < 22) {
         burc = "Oğlak";
         } else {
         burc = "Kova";
         }
         } else {
         isError = true;
         }
         break;
         case 2:
         if (day >= 1 && day <= 29) {
         if (day < 20) {
         burc = "Kova";
         } else {
         burc = "Balik";
         }
         } else {
         isError = true;
         }
         break;
         case 3:
         if (day >= 1 && day <= 31) {
         if (day < 21) {
         burc = "Balık";
         } else {
         burc = "Koc";
         }
         } else {
         isError = true;
         }
         break;
         case 4:
         if (day >= 1 && day <= 30) {
         if (day < 21) {
         burc = "Koc";
         } else {
         burc = "Boga";
         }
         } else {
         isError = true;
         }
         break;
         case 5:
         if (day >= 1 && day <= 31) {
         if (day < 21) {
         burc = "Boga";
         } else {
         burc = "Ikızler";
         }
         } else {
         isError = true;
         }
         break;
         case 6:
         if (day >= 1 && day <= 30) {
         if (day < 21) {
         burc = "Ikızler";
         } else {
         burc = "Yengec";
         }
         } else {
         isError = true;
         }
         break;
         case 7:
         if (day >= 1 && day <= 31) {
         if (day < 22) {
         burc = "Yengec";
         } else {
         burc = "Aslan";
         }
         } else {
         isError = true;
         }
         break;
         case 8:
         if (day >= 1 && day <= 31) {
         if (day < 23) {
         burc = "Aslan";
         } else {
         burc = "Başak";
         }
         } else {
         isError = true;
         }
         break;
         case 9:
         if (day >= 1 && day <= 31) {
         if (day < 23) {
         burc = "Basak";
         } else {
         burc = "Terazi";
         }
         } else {
         isError = true;
         }
         break;
         case 10:
         if (day >= 1 && day <= 30) {
         if (day < 22) {
         burc = "Terazi";
         } else {
         burc = "Akrep";
         }
         } else {
         isError = true;
         }
         break;
         case 11:
         if (day >= 1 && day <= 31) {
         if (day < 21) {
         burc = "Akrep";
         } else {
         burc = "Yay";
         }
         } else {
         isError = true;
         }
         break;
         case 12:
         if (day >= 1 && day <= 31) {
         if (day < 21) {
         burc = "Yay";
         } else {
         burc = "Oglak";
         }
         } else {
         isError = true;
         }
         break;
         default:
         isError = true;
         }
         if (isError){
         System.out.println("Hatalı giriş yaptiniz, tekrar deneyiniz." );

         }else {
         System.out.println("Burcunuz: " + burc);
         }






        }


    }
}
