import java.util.Scanner;
  class Main { 
    public static int pow(int floor,int power){
      int pow=1;
      for(int i=1; i<=power; i++){
        pow*=floor;
      }
      return pow;
    }
    public static void main(String[] args) {    
      Scanner s=new Scanner(System.in);
      System.out.print("floor : ");
      int floor=s.nextInt();
      System.out.print("power : ");
      int power=s.nextInt();    

      System.out.print(floor+"^"+power+" = "+pow(floor,power));        
   }
}