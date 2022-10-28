package JavaProject1;

import java.util.Scanner;
public class NotOrtHesap {
public static void main(String[] args) {
    int matematik , fizik , kimya , biyoloji ,gecmeNotu;
    gecmeNotu=60;
    String gecti="GEÇTİNİZ", kaldi="KALDINIZ";
    Scanner inp = new Scanner(System.in);
    System.out.println("matematik notunuzu giriniz");
    matematik=inp.nextInt();
    System.out.println("fizik notunuzu giriniz");
    fizik=inp.nextInt();
    System.out.println("kimya notunuzu giriniz");
    kimya=inp.nextInt();
    System.out.println("biyoloji notunuzu giriniz");
    biyoloji=inp.nextInt();
    int toplam=(matematik+fizik+kimya+biyoloji);
    float sonuc=toplam/4;
    System.out.println("not ortalamanız:"+sonuc);
    String durum=(sonuc>=gecmeNotu)?gecti:kaldi;

    System.out.println(durum);

}


}   

