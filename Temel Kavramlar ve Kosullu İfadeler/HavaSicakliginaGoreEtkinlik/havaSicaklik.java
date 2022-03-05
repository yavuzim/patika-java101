  import java.util.Scanner;
  class Main {
   
    public static void main(String[] args) {     
     Scanner scan = new Scanner(System.in);
      int sicaklik; 
      String durum;
      System.out.print("Sıcaklık : ");
      sicaklik=scan.nextInt();
      if(sicaklik<5) durum="Kayak";
      else if(sicaklik>4 && sicaklik<16) durum="Sinema";
      else if(sicaklik>14 && sicaklik<26) durum="Piknik"; 
      else durum="Yüzme";
       System.out.print(durum);
     
    }
}