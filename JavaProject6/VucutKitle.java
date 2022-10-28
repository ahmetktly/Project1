package JavaProject6;

import java.util.Scanner;

public class VucutKitle {

    public static void main(String[] args) {
        
        Double boy , kilo, vki ;

            Scanner k=new Scanner(System.in);

                System.out.println("Boyunuzu metre olarak giriniz");

                    boy=k.nextDouble();
                
                System.out.println("Kilonuzu giriniz");

                    kilo=k.nextDouble();

                vki=kilo/(boy*boy);

                System.out.print("VKE:"+vki);

    }
    
}
