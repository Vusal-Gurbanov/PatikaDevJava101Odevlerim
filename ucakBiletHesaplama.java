package kosul_ifadeleri;
import java.util.Scanner;
public class ucakBiletHesaplama {
    public static void main(String[] args) {
                int type;

                double km, age, total,newtotal=0,top;

                Scanner inp = new Scanner(System.in);

                System.out.println("Mesafeyi k.m olaraq giriniz :");
                km = inp.nextDouble();

                System.out.println("Yaş giriniz :");
                age = inp.nextDouble();


                System.out.println("Ucuş türünü seciniz ?:\nTek yön ise 1:\nGidiş dönüş ise 2: ");

                type = inp.nextInt();

                total = km * 0.10;

                if ((km > 0) && (age > 0)) {
                    if (age < 12) {
                        newtotal = total - (total * 0.2);
                    } else if ((age >= 12) && (age < 24)) {
                        newtotal = total - (total * 0.1);
                    } else if ((age>=24)&&(age<=65)) {
                        newtotal=total;
                    } else if (age > 65) {
                        newtotal = total - (total * 0.3);
                    }if (type==2){
                        newtotal=(newtotal-(newtotal*0.2))*2;
                    } else if (type==1) {
                        newtotal=newtotal;
                    }
                }else {
                    System.out.println("Yalnış bilgi girdiniz.\nLütfen bilgilri kontrol edib, tekrar deneyiniz!");
                }

                System.out.println("Uçak bilet tutariniz :" + newtotal);
    }
}
