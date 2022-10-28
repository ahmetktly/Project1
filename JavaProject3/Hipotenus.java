package JavaProject3;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        int first , second ,third;
        double alan,u;

    Scanner kenar = new Scanner(System.in);
    
    System.out.println("İlk Kenar Uzunluğunu Giriniz");
        first=kenar.nextInt();
        
    System.out.println("İkinci Kenar Uzunluğunu Giriniz");
        second=kenar.nextInt();
    
   System.out.println("Üçüncü Kenar Uzunluğunu Giriniz");
        third=kenar.nextInt();
        
            u=(first+second+third)/2;

            alan=Math.sqrt(u*(u-first)*(u-second)*(u-third));


    System.out.print("Üçgenin Alanı:"+alan);

    
   

        
    }
    


}
