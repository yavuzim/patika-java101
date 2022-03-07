  import java.util.Scanner;
  class Main {   
    public static void main(String[] args) {             
      Scanner scan = new Scanner(System.in); 
      int sayi=2,toplam=0;
      while(sayi%2==0){     
        System.out.print("Sayı : ");
        sayi=scan.nextInt();
        if(sayi%4==0) toplam+=sayi;
      }
      System.out.print("Toplam : "+toplam);
  }
}