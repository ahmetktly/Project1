package JavaProject8;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        
    

    Scanner tar=new Scanner(System.in);
    System.out.println("İlk Sayıyı Giriniz");

    int i=tar.nextInt();

    System.out.println("İkinci Sayıyı Giriniz");

    int a=tar.nextInt();

    double sonuc;

    System.out.println("Yapmak İstediğiniz İşlemi Giriniz");
    System.out.println("Not:toplama , cikarma, carpma, bolme şeklinde girilecektir");

    String islem=tar.next();


    

    switch (islem){

        case("toplama"):
        sonuc=a+i;
            System.out.println("Sonuç="+sonuc);

        break;

        case("cikarma"):
        sonuc=i-a;
            System.out.println("Sonuç="+sonuc);
    
        break;

        case("carpma"):
        sonuc=a*i;
            System.out.println("Sonuç="+sonuc);

        break;

        case("bolme"):
        
        switch(a){

            case(0):
            System.out.println("0 ile bölünemez değeri değiştirin");
            a=tar.nextInt();
            sonuc=i/a;
            System.out.println("Sonuc="+sonuc);
            break;
    
            default:
        sonuc=i/a;
            System.out.println("Sonuç="+sonuc);
            break;

        
        }
        break;
        
        default:

        System.out.println("Hatalı İşlem Girişi");

        break;



    }


          


        }


    }

    
