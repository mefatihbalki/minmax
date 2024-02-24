import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler
        int max = 0;
        int min = 0;
        int n, i, sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        n = input.nextInt();
        //Veri giriş döngüsü
        for (i=0; i<n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayi = input.nextInt();
            if (i == 0) {
                max = sayi;
                min = sayi;
            } else {
                if (sayi > max) {
                    max = sayi;
                }
                if (sayi < min) {
                    min = sayi;
                }
            }
        }
        //Sonuç
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
