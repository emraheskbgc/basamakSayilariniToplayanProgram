import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi ;
        int basSayisi = 0;
        int tempSayi ;
        int basDegeri;
        int sonuc = 0;
        System.out.println("Bir Sayı Giriniz = ");
        sayi = input.nextInt();
        tempSayi = sayi;
        while (tempSayi != 0){
            tempSayi /= 10;
            basSayisi++;
        }
        tempSayi = sayi;
        while (tempSayi != 0){
            basDegeri = tempSayi %10;
            sonuc = sonuc + basDegeri;
            tempSayi /= 10;

        }

        System.out.println(sonuc);
    }
}
