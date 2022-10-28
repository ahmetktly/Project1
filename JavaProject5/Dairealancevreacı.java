package JavaProject5;
import java.util.Scanner;
public class Dairealancevreacı {
    public static void main(String[] args) {
        
        Double yaricap,alan,cevre,aci,dilimalan;

        Scanner a=new Scanner(System.in);

        System.out.println("yarıçap değeri girin");
        yaricap=a.nextDouble();

            alan=314/100*(yaricap*yaricap);
            cevre=2*314/100*yaricap;

        System.out.println("Alan:"+alan);
        System.out.println("Çevre:"+cevre);

        System.out.println("Açı Değeri Girin");
    
        aci=a.nextDouble();

            dilimalan=(314/100*yaricap*yaricap*aci)/360;
            System.out.println("Dilim Alanı="+dilimalan);


    }
}
