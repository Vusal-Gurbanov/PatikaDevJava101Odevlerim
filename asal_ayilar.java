package kosul_ifadeleri;

public class asal_ayilar {
    public static void main(String[] args) {
        /* 1 -100 arasındaki asal sayıları yazdırmak için döngüyü en küçük olan asal sayıdan başlatıp, çift döngü ile
        sıradaki sayının kendinden öncekilere bölünüp bölünmediğini kontrol ederiz. Sayı bölünmüyorsa asaldır ve asal
        olan sayıyı da ekrana yazdırıyoruz.
        *
        Asal Sayı = Sadece 1’e ve kendisine tam bölünebilen sayılardır.*/


        int sayac = 0;
        for(int sayi=2;sayi<=100;sayi++)
        {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++)
            {
                if (sayi % i == 0)
                {
                    kontrol = 1;
                    break;
                }
            }
            if(kontrol==0)
            {
                System.out.print(sayi+"\n");
                sayac++;
            }
        }

    }
}
