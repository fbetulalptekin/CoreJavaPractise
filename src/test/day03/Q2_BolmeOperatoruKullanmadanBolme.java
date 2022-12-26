package test.day03;

import java.util.Scanner;

public class Q2_BolmeOperatoruKullanmadanBolme {

    public static void main(String[] args) {


        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim
        // ve bolme operatoru kullanmadan bolme islemini gerceklestirip
        // bolumu hesaplayan method create ediniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bölmek istediğiniz sayıyı giriniz");
        int bolunen = scan.nextInt();

        System.out.println("Lütfen bölen sayıyı giriniz");
        int bolen = scan.nextInt();

        System.out.println( bolunen+ "/" + bolen+ "=" + bol(bolunen, bolen));


    }

    public static int bol(int bolunen, int bolen) {

        int bolum =0;

        while (bolunen>=bolen) {

            bolunen-=bolen;

            bolum++;
        }

        return bolum;
    }

}
