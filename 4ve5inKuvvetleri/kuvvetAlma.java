import java.util.Scanner;
import java.lang.Math;
  class Main { 
    public static void main(String[] args) {             
      Scanner in=new Scanner(System.in);
      System.out.print("Number : ");
      int n=in.nextInt();
      System.out.println("4'ün"+" "+n+"'e kadar olan kuvvetleri");
      for(int i=0; i<=n; i++){
          System.out.println("4^"+i+" = "+(int)Math.pow(4,i));
      }
      
      System.out.println();
      System.out.println("*************************");
      System.out.println();
      System.out.println("5'in"+" "+n+"'e kadar olan kuvvetleri");
      for(int i=0; i<=n; i++){
          System.out.println("5^"+i+" = "+(int)Math.pow(5,i));
      }
   }
}