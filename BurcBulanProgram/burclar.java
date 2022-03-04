  import java.util.Scanner;
  class Main {   
    public static void main(String[] args) {             
      Scanner scan = new Scanner(System.in);
      System.out.print("Doğduğunuz Ay : ");
      int ay=scan.nextInt();
      System.out.print("Doğduğunuz Gün : ");
      int gun=scan.nextInt();
      String burc="";
      boolean hata=true;

      if(ay==1){
        if(gun>=1 && gun<=31){
          if(gun<=21) burc="Oğlak";
          else burc="Kova";
        }
        else hata=false;
      }
      else if(ay==2){
        if(gun>=1 && gun<=28){
          if(gun<=19) burc="Kova";
          else burc="Balık";
        }
        else hata=false;
      }
      else if(ay==3){
        if(gun>=1 && gun<=31){
          if(gun<=20) burc="Balık";
          else burc="Koç";
        }
        else hata=false;
      }
      else if(ay==4){
        if(gun>=1 && gun<=30){
          if(gun<=20) burc="Koç";
          else burc="Boğa";
        }
        else hata=false;
      }
      else if(ay==5){
        if(gun>=1 && gun<=31){
          if(gun<=21) burc="Boğa";
          else burc="İkizler";
        }
        else hata=false;
      }
      else if(ay==6){
        if(gun>=1 && gun<=30){
          if(gun<=22) burc="İkizler";
          else burc="Yengeç";
        }
        else hata=false;
      }
      else if(ay==7){
        if(gun>=1 && gun<=31){
          if(gun<=22) burc="Yengeç";
          else burc="Aslan";
        }
        else hata=false;
      }
      else if(ay==8){
        if(gun>=1 && gun<=31){
          if(gun<=22) burc="Aslan";
          else burc="Başak";
        }
        else hata=false;
      }
      else if(ay==9){
        if(gun>=1 && gun<=30){
          if(gun<=22) burc="Başak";
           else burc="Terazi";
        }
        else hata=false;
      }
      else if(ay==10){
        if(gun>=1 && gun<=31){
          if(gun<=22) burc="Terazi";
           else burc="Akrep";
        }
        else hata=false;
      }
      else if(ay==11){
        if(gun>=1 && gun<=30){
          if(gun<=21) burc="Akrep";
           else burc="Yay";
        }
        else hata=false;
      }
      else if(ay==12){
        if(gun>=1 && gun<=31){
          if(gun<=21) burc="Yay";
           else burc="Oğlak";
        }
        else hata=false;
      }
      else hata=false;
        if(!hata) System.out.print("Hatalı Ay veya Gün Girişi Yapıldı!");
    else System.out.print("Merhaba Burcunuz : "+burc);
    }
  
}