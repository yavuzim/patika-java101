  import java.util.Scanner;
  import java.lang.Math;
  class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Yarıçap : ");
      int r = scan.nextInt();
      System.out.print("Açı : ");
      int aci = scan.nextInt();
      final double pi = 3.14;
      
      double alan = pi*Math.pow(r,2);
      double cevre = 2*pi*r;

      double dilimAlan = (pi*Math.pow(r,2)*aci)/360;

      
      System.out.println("Alan : "+alan);
      System.out.println("Çevre : "+cevre);
      System.out.println("Dilim Alan : "+dilimAlan);
      
      }
  }