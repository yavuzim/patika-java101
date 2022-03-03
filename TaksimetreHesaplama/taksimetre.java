  import java.util.Scanner;
  class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("KM : ");
      int km = scan.nextInt();
      double fiyat = 10 + km*220/100;
      String mesaj="";
      double ucret = (fiyat<20) ? 20 : fiyat;
      
       System.out.print("Ücret : "+ucret);
      
      }
  }