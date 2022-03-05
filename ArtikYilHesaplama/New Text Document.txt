  import java.util.Scanner;
  class Main {   
    public static void main(String[] args) {             
      Scanner scan = new Scanner(System.in);
      System.out.print("Yıl : ");
      int yil=scan.nextInt();
      String durum="";
      if(yil%4==0 && yil%100>0) durum=yil+" bir artık yıldır !"; 
      else if(yil%100==0 && yil%400==0) durum=yil+" bir artık yıldır !"; 
      else durum=yil+" bir artık yıldır değildir !";
      System.out.print(durum);
    }
  
}