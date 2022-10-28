package JavaProject4;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Double mesafe,ucret;
        Scanner km=new Scanner(System.in);

        System.out.println("KM Değeri Giriniz");
        mesafe=km.nextDouble();

            ucret=(mesafe*220/100)+10;
            ucret=(ucret<20)?20:ucret;

                System.out.print("Ödeme Tutarı:"+ucret);
                System.out.print("TL");




    }
    
}

