import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Kenar 1 : ");
    int k1 = scan.nextInt();
    System.out.print("Kenar 2 : ");
    int k2 = scan.nextInt();
    System.out.print("Kenar 3 : ");
    int k3 = scan.nextInt();

    int u = (k1+k2+k3)/2;
    int cevre = 2*u;
    double hesap = u*(u-k1)*(u-k2)*(u-k3);
    double alan = Math.sqrt(hesap);

    System.out.print("Çevre : "+cevre+"\n Alan : "+alan);
    
    }
}