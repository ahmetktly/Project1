package JavaProject2;
import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {

        double anapara , kdvmiktar , toplam, kdv;
        
        Scanner para= new Scanner(System.in);
        
        System.out.println("Ana Para Değeri Giriniz");
        
        anapara=para.nextDouble();

            kdv=(1000>anapara)?18:8;
                System.out.println("KDV değeri:"+kdv);

            kdvmiktar=anapara*kdv/100;
            toplam=kdvmiktar+anapara;
                System.out.println("KDV miktarı:"+kdvmiktar);    
                System.out.println("KDV'li tutar:"+toplam);

           

    }
    
}
