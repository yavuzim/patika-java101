import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Fiyat : ");
    double fiyat = scan.nextDouble();
    System.out.print("KDV(%) : ");
    int kdv = scan.nextInt();

    double kdvFiyat = fiyat*(100+kdv)/100;
    double kdvTutar = kdvFiyat - fiyat;
    
    System.out.println("******************");
    
    System.out.println("Fiyat : "+fiyat);
    System.out.println("KDV(%) : "+"%"+kdv);
    System.out.println("KDV Fiyat : "+kdvFiyat);
    System.out.print("KDV Tutar : "+kdvTutar);
    
    }
}