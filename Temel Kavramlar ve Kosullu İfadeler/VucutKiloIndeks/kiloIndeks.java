  import java.util.Scanner;
  import java.lang.Math;
  class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Kilogram(kg) : ");
      int kg = scan.nextInt();
      System.out.print("Boy(m) : ");
      double boy = scan.nextDouble();

      double indeks=kg/Math.pow(boy,2);
     System.out.print("Vücut Kitle İndeksiniz : "+indeks);
      
      }
  }