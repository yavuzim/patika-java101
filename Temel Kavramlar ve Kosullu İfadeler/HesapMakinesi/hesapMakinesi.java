  import java.util.Scanner;
  class Main {
    public static void main(String[] args) {     
      Scanner scan = new Scanner(System.in);
      System.out.print("Sayı 1 : ");
      int s1 = scan.nextInt();
      System.out.print("Sayı 2 : ");
      int s2 = scan.nextInt();
      System.out.println("************************");
      System.out.println("Toplma (+)\nÇıkarma (-)\nÇarpma (*)\nBölme (/)");
      System.out.println("************************");
      System.out.print("İşlem Seç : ");
      String islem = scan.next();

      switch(islem){
        case "+": System.out.print("Toplam : "+(s1+s2)); break;
        case "-": System.out.print("Çıkarma : "+(s1-s2)); break;
        case "*": System.out.print("Çarpma : "+(s1*s2)); break;
        case "/": System.out.print("Bölme : "+(s1/s2)); break;
        default : System.out.print("Geçersiz Değer"); break;
      }
      
    }
}