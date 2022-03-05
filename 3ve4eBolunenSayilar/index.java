  import java.util.Scanner;
  class Main {   
    public static void main(String[] args) {             
      Scanner scan = new Scanner(System.in);
      System.out.print("Sayı : ");
      int sayi = scan.nextInt();
      for(int i=0; i<sayi; i++){
        if(i%3==0 && i%4==0){
          System.out.println(i);
        }
      }
  }
}