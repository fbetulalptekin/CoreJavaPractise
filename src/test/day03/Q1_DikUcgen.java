package test.day03;

import java.util.Scanner;

public class Q1_DikUcgen {

    public static void main(String[] args) {

        /*
   Kullanicidan uc adet sayi alarak bu sayilarin
   bir dik ucgenin kenar uzunluklari olup olmadigini hesaplatan bir kod yaziniz
   NOT:
   Bir ucgenin dik oldugunu anlamak icin a2+b2=c2 pisagor
   denkleminden yararlanabilirsiniz.
   -----Ornek Ekran Ciktisi-----
   ilk kenari giriniz: 2
   ikinci kenari giriniz 15
   üçüncü kenari giriniz: 7
   Bu bir dik ucgen degildir.
   Bu bir dik ucgendir.
                        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Dik ucgen olup olmadigini anlamak icin 3 kenar uzunlugu giriniz : ");

        System.out.println("Birinci kenar uzunlugunu giriniz : ");
        int kenar1 = scan.nextInt();

        System.out.println("Ikinci kenar uzunlugunu giriniz: ");
        int kenar2 = scan.nextInt();

        System.out.println("Ucuncu kenar uzunlugunu giriniz : ");
        int kenar3 = scan.nextInt();

        System.out.println("*******1.cozum*********");

        if (kenar1*kenar1 == (kenar2*kenar2) + (kenar3*kenar3)) System.out.println("Bu bir dik ucgendir");
        else if (kenar2*kenar2 == (kenar1*kenar1) + (kenar3*kenar3)) System.out.println("Bu bir dik ucgendir");
        else if (kenar3*kenar3 == (kenar2*kenar2) + (kenar1*kenar1)) System.out.println("Bu bir dik ucgendir");
        else System.out.println("Bu bir dik ucgen degildir");

        System.out.println("*******2.cozum*********");

        if (kenar1*kenar1 == (kenar2*kenar2) + (kenar3*kenar3) || kenar2*kenar2 == (kenar1*kenar1) + (kenar3*kenar3) || kenar3*kenar3 == (kenar2*kenar2) + (kenar1*kenar1) )
            System.out.println("Bu bir dik ucgendir");
        else System.out.println("Bu bir dik ucgen degıldır");








    }
}
