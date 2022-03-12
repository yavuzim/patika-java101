import java.util.Scanner;
  class Main { 
    public static int C(int n,int r){
       int share=1,denominator=1;
      for(int i=n; i>(n-r); i--)
        share=share*i; // 5,4,3
      for(int i=r; i>1; i--)
        denominator=denominator*i;
      return share/denominator;
    }
    public static void main(String[] args) {    
      Scanner s=new Scanner(System.in);
      System.out.print("n : ");
      int n=s.nextInt();
      System.out.print("r : ");
      int r=s.nextInt();    

      System.out.print("C("+n+","+r+") = "+C(n,r));        
   }
}