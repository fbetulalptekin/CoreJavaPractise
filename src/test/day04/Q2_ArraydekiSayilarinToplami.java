package test.day04;

public class Q2_ArraydekiSayilarinToplami {

    public static void main(String[] args) {

        //Create an array of 5 floats and calculate their sum.


       // float [] numbers = new float[5];

        float [] numbers = {1.0f,2.0f,3.2f,5.0f,7.5f};

        float toplam = 0;

        System.out.println("^^^^^^^^^^^For Loop Çözümü^^^^^^^^^^^^");

        for (int i = 0; i < numbers.length ; i++) {

            toplam+=numbers[i];

        }

        System.out.println("Toplam: " + toplam); // 18.7

        System.out.println("^^^^^^^^^^^While Loop Çözümü^^^^^^^^^^^^");

        toplam = 0;
        int index = 0;

        while (index<numbers.length) {

            toplam += numbers[index];

            index++;
        }

        System.out.println(toplam); // 18.7

        System.out.println("^^^^^^^^^^^While Loop Çözümü 2^^^^^^^^^^^^");

      /*  toplam = 0;
        int ind = numbers.length-1;

        while (ind>=0) {

            toplam += numbers[ind];

            index--;
        }

        System.out.println(toplam);

       */
















    }
}
