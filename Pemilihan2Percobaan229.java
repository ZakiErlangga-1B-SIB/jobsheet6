import java.util.Scanner;
public class Pemilihan2Percobaan229 {
    
    public static void main(String[] args) {
        Scanner input29 =new Scanner (System.in);
        System.out.print("Masukkan sudut pertama segitiga: ");
        float sudut1 = input29.nextFloat();
        System.out.print("Masukkan sudut kedua segitiga: ");
        float sudut2 = input29.nextFloat();
        System.out.print("Masukkan sudut ketiga segitiga: ");
        float sudut3 = input29.nextFloat();
    
        float totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == sudut2) || (sudut2 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga sama sisi");
        }else
            System.out.println("Bukan Segitiga");
    }
}