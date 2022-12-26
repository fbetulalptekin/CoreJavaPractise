package test.day02;

import java.util.Scanner;

public class Q1_RakamPozitifSayi {

    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        double girilenSayi = scan.nextDouble();

        if (girilenSayi >= 0) {
            if (girilenSayi < 10) {
                System.out.println("rakam");
            } else {
                System.out.println("pozitif sayi");
            }
        } else {
                System.out.println("negatif sayi");
            }


            // böyle de olur ama nested çözümü daha iyi:

            //if (sayi>=10) System.out.println("Pozitif Sayi");
            //else if (sayi<0) System.out.println("Negatif Sayi");
            //else System.out.println("Rakam");

        System.out.println("************ Ternary cozumu ****************");



        System.out.println((girilenSayi >= 0 ? (girilenSayi < 10 ? "rakam" : "pozitif sayi") : "negatif sayi"));



        // String result =(sayi>=0) ? ( (sayi<10) ? "Rakam" : "Pozitif Sayi") : ("Negatif Sayi");
       //  System.out.println(result);
    }

    }


