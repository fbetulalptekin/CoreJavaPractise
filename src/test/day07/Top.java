package test.day07;

public class Top {
    public static void main(String[] args) {

        // Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan
        // do while code blogu create ediniz.

        double yukseklik = 1.60;
        int yereVurmaSayisi = 0;
        double topunToplamYolu = 0;

        do {
            topunToplamYolu+=yukseklik;
            yereVurmaSayisi++;
            yukseklik*=0.75;
            if (yukseklik>=1)
            topunToplamYolu+=yukseklik;
            else break;

        }while(yukseklik>=1);

        System.out.println("Topun aldigi toplam yol = "+ topunToplamYolu+
                "\nTopun yere vurma sayisi = "+yereVurmaSayisi);





    }

    }


