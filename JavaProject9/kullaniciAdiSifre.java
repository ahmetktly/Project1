package JavaProject9;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class kullaniciAdiSifre {

    public static void main(String[] args) {

        String id,pass,kpass="patikadev";

        Scanner tar=new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        id=tar.nextLine();

        System.out.print("Şifrenizi Giriniz:");
        pass=tar.nextLine();

        if(id.equals("ahmetkutlay")){
            System.out.println("Doğru Kullanıcı Adı");
        }
        else{

            System.out.println("Hatalı Kullanıcı Adı \nLütfen tekrar giriniz:");  
            id=tar.nextLine();          
        }
        if(pass.equals(kpass)){

            System.out.println("Doğru Şifre");
        
        }
        
        else{

            System.out.println("Hatalı Şifre\nŞifre sıfırlansınmı Y/N");

            String ans=tar.nextLine();
        
            switch (ans) {
        
                case("Y"):
        
                System.out.println("Yeni Şifrenizi Giriniz:");

                    pass=tar.nextLine();
        
                   if(pass.equals(kpass)){

                        System.out.println("Eski Şifreniz iLe aynı olamaz\nLütfen farklı bir şifre giriniz");

                        pass=tar.nextLine();

                        pass=kpass;
                        System.out.println("Şifre Değiştirildi");
                    
                    }

                    else{

                        pass=kpass;

                        System.out.println("Şifre Değiştirildi");


                    }
                    break;
                    
                case("N"):

                    System.out.println("Lütfen Şifrenizi Tekrar Deneyiniz:");

                    break;
            
                default:

                    System.out.println("Hatalı Seçim Yaptınız Lütfen Programı Yeniden Çalıştırın");
                    break;
            } 
            
        }



    }
    
}
