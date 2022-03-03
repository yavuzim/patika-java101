import java.lang.Math;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    double matematik=-1,fizik=-1,kimya=-1,tarih=-1,biyoloji=-1,turkce=-1;
    Scanner scan = new Scanner(System.in);
    while(matematik==-1 || fizik==-1 || kimya==-1 || tarih==-1 || biyoloji==-1 || turkce==-1 || matematik<0 || matematik>100 || fizik<0 || fizik>100 || kimya<0 || kimya>100 || tarih<0 || tarih>100 || biyoloji<0 || biyoloji>100 || turkce<0 || turkce>100){
          System.out.print("Matematik: ");
          matematik=scan.nextDouble();
          System.out.print("Fizik: ");
          fizik=scan.nextDouble();
          System.out.print("Kimya: ");
          kimya=scan.nextDouble();
          System.out.print("Tarih: ");
          tarih=scan.nextDouble();
          System.out.print("Biyoloji: ");
          biyoloji=scan.nextDouble();
          System.out.print("Türkçe: ");
          turkce=scan.nextDouble();
    }

    double ortalama;
    ortalama=Math.round((matematik+fizik+kimya+turkce+biyoloji+tarih)/6);
    String durum;
    if(ortalama<60) durum="Kaldı!";
    else durum="Geçti";
    System.out.println();
    System.out.print("Ortalama : "+ortalama+" - "+durum);
    
    
    }
}