package JavaProject7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {

        Scanner tar=new Scanner(System.in);

        Double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;

        Double armutkg,elmakg,domateskg,muzkg,patlicankg,toplam;

        System.out.println("Armut Kg Giriniz");

        armutkg=tar.nextDouble();

        System.out.println("Elma Kg Giriniz");

        elmakg=tar.nextDouble();

        System.out.println("Domates Kg Giriniz");
        
        domateskg=tar.nextDouble();

        System.out.println("Muz Kg Giriniz");
       
        muzkg=tar.nextDouble();

        System.out.println("Patlıcan Kg Giriniz");

        patlicankg=tar.nextDouble();
        
            toplam=(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlican*patlicankg);

            DecimalFormat formater=new DecimalFormat("##.##");

            System.out.print("Ödenecek Toplam Tutar="+(formater.format(toplam)));
        
            System.out.print("TL");
    }
    
}
