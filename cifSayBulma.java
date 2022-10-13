import java.util.Scanner;
public class cifSayBulma {
    public static void main(String[] args) {
        int n, total = 0, piece = 0;
        double average;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter Your Number : ");
        n = inp.nextInt();

        for (int i = 0; i <= n; i++) {
            if ((i % 3 == 0) || (i % 4 == 0)){
                total += i;
                piece++;
            }
        }

        average = total / (piece - 1);
        System.out.println("Sonuc : " + average);

    }
}
