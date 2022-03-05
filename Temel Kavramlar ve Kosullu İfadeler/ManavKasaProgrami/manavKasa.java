  import java.util.Scanner;
  class Main {
    public static void main(String[] args) {

      double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
      // 4.78
      Scanner scan = new Scanner(System.in);
      System.out.print("Armut Kaç Kilo? : ");
      int armutKg = scan.nextInt();
      System.out.print("Elma Kaç Kilo? : ");
      int elmaKg = scan.nextInt();
      System.out.print("Domates Kaç Kilo? : ");
      int domatesKg = scan.nextInt();
      System.out.print("Muz Kaç Kilo? : ");
      int muzKg = scan.nextInt();
      System.out.print("Patlican Kaç Kilo? : ");
      int patlicanKg = scan.nextInt();

      double toplamFiyat=armutKg*armut+elmaKg*elma+domatesKg*domates+muzKg*muz+patlicanKg*patlican;

      System.out.print("Toplam Tutar : "+toplamFiyat);     
      
      }
  }