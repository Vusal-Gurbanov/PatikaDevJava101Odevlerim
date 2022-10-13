import java.util.Scanner;

public class dort_ve_besh_kuvveti {
    public static void main(String[] args) {

        int z;

        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz : ");
        z = input.nextInt();

        System.out.println("Girilen sayıya kadar 4' ün kuvvetleri : ");
        for (int i = 1; i <= z; i *= 4){
            System.out.println(i + ",");
        }
        System.out.println("Girilen sayıya kadar 5' in kuvvetleri : ");
        for(int i = 1; i <= z; i*=5){
            System.out.println(i + ",");
        }

    }
}
