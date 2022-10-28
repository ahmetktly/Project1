package JavaProject5;
import java.util.Scanner;
public class Odev5 {
    public static void main(String[] args) {
        
        Double yarıcap,alan,cevre,acı,dilimalan;

        Scanner a=new Scanner(System.in);

        System.out.println("yarıçap değeri girin");
        yarıcap=a.nextDouble();

            alan=314/100*(yarıcap*yarıcap);
            cevre=2*314/100*yarıcap;

        System.out.println("Alan:"+alan);
        System.out.println("Çevre:"+cevre);

        System.out.println("Açı Değeri Girin");
    
        acı=a.nextDouble();

            dilimalan=(314/100*yarıcap*yarıcap*acı)/360;
            System.out.println("Dilim Alanı="+dilimalan);


    }
}
