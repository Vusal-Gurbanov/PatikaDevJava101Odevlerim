import java.util.Scanner;
public class poje_ATM_switchCase {
    public static void main(String[] args) {

        String kulaniciIsmi, sifre;
        Scanner inp = new Scanner(System.in);
        int hakkiniz = 3;
        int seciminiz, bakiye = 1500,girilenTutar;

        while (hakkiniz > 0) {
            System.out.println("Kullanıcı İsminizi giriniz:");
            kulaniciIsmi = inp.nextLine();
            System.out.println("Şifrenizi Giriniz:");
            sifre = inp.nextLine();
            if (kulaniciIsmi.equals("aze") && sifre.equals("2468")) {
                System.out.println("Bankamıza Hoş Geldiniz.");
                do {
                    System.out.println("--------------------------");
                    System.out.println("Lütfen yapmag istediğiniz işlemi seciniz:");
                    System.out.println("\n.Para yatırmak icin 1:\nPara cekmek icin. 2\nBakiye sorgulamak icin. 3\nÇıkış yapmak icin. 4");
                    seciminiz = inp.nextInt();
                    switch (seciminiz){
                        case 1:
                            System.out.println("Yatırılacak para miktarı:");
                            girilenTutar= inp.nextInt();
                            bakiye += girilenTutar;
                            System.out.println(girilenTutar + " Tl Hesabınıza yatırıldı.\nYeni hesap bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.println("Cekilecek para miktarı giriniz:");
                            girilenTutar= inp.nextInt();
                            if (girilenTutar <= bakiye) {
                                bakiye -= girilenTutar;
                                System.out.println(girilenTutar + " Tl Hesabinizdan cekildi.\nYeni hesap bakiyeniz: " + bakiye);
                            } else {
                                System.out.println("Bu işlem icin yeterli bakiyeniz Tl niz yok.\nHesap Bakiyeniz:" + bakiye + " tl\nLütfen bakiyeniz kadar tutar giriniz " + bakiye + " tl.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye + " tl.");
                            break;
                    }
                } while (seciminiz != 4);
                System.out.println("Tekrar görüşürüz.");
                break;
            } else {
                hakkiniz--;
                System.out.println("Yanlış girdiniz. Lütfen tekrar deneyin.");
                if (hakkiniz == 0) {
                    System.out.println("Hesabınız bloke edilmiştir.Lütfen bankayla iletişime geçin.  ");
                } else {
                    System.out.println("kalan hakkınız:" + hakkiniz);
                }
            }
        }
    }
}
