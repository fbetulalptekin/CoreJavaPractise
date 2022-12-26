package test.day02;

import java.util.Scanner;

public class Q02_SwitchCase_HesapMakinesi {

    public static void main(String[] args) {

        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin
         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
         *
         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
         *
         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180
         *
         *
         */

        System.out.println("***************If cozumu****************");

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen matematiksel işleme sokmak için iki tane tam sayı giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();


        System.out.println("islem turunu seciniz : \n\t1. Toplama \n\t2. Çıkarma \n\t3. Çarpma \n\t4. Bölme");

        int islem = scan.nextInt();

        if (islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if(b==0) System.out.println("0'a bolum tanimsizdir");
            else System.out.println(a/b);
        }
        else System.out.println("yanlis giris yaptiniz, lutfen tekrar deneyiniz");


        System.out.println("*******************switch Case cozumu******************");

        switch (islem) {
            case 1 :
                System.out.println(a+ " + "+ b + " = " + (a+b));
                break;
            case 2 :
                System.out.println(a+ " - "+ b + " = " + (a-b));
                break;
            case 3 :
                System.out.println(a+ " * "+ b + " = " + (a*b));
                break;
            case 4 :
                System.out.println(a+ " / "+ b + " = " + (a/b));
                if (b == 0) System.out.println("0'a bolum tanimsizdir");
                else System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("yanlis giris yaptiniz, tekrar deneyiniz");
        }

        System.out.println("*************switch Case 2 cozumu*****************");

        System.out.println("Islem turunu seciniz : \n\t+ : Toplama\n\t- : Cikarma\n\t* : Carpma\n\t/ : Bolme");


        char isaret = scan.next().charAt(0);

        switch (isaret){
            case '+' : System.out.println(a + " + " + b +" = " + (a+b)); break;

            case '-' : System.out.println(a + " - " + b +" = " + (a-b)); break;

            case '*' : System.out.println(a + " * " + b +" = " + (a*b)); break;

            case '/' :
                if(b==0) System.out.println("0'a bolum tanimsizdir");
                else System.out.println(a + " / " + b +" = " + (a/b));
            break;

            default: System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz");
        }



    }
}
