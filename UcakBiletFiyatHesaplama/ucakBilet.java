  import java.util.Scanner;
  class Main {   
    public static void main(String[] args) {             
      Scanner scan = new Scanner(System.in);
      System.out.print("Mesafeyi km türünden giriniz  : ");
      double km=scan.nextDouble();
      System.out.print("Yaşınızı giriniz  : ");
      int yas=scan.nextInt();
      System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
      int yolTip=scan.nextInt();
      if(km<0 || yas<0 || (yolTip!=1 && yolTip!=2)) System.out.print("Hatalı  giriş!");
      else{
        double toplamTutar=0;
        if(yas<12){
          switch(yolTip){
            case 1: toplamTutar=(0.10*km)*50/100; break;
            case 2: toplamTutar=((0.10*km)*50/100*80/100)*2; break;
            default: System.out.print("");
          }        
        }
        else if(yas>=12 && yas<=24){
           switch(yolTip){
            case 1: toplamTutar=(0.10*km)*90/100; break;
            case 2: toplamTutar=((0.10*km)*90/100*80/100)*2; break;
          }
          
        }
        else if(yas>=25 && yas<65){
           switch(yolTip){
            case 1: toplamTutar=(0.10*km); break;
            case 2: toplamTutar=((0.10*km)*80/100)*2; break;
          }  
        }
        else{
          switch(yolTip){
            case 1: toplamTutar=(0.10*km)*70/100; break;
            case 2: toplamTutar=((0.10*km)*70/100*80/100)*2; break;
          }  
        }
      System.out.print("Toplam Tutar : "+(int)toplamTutar+" "+"TL");
      }      
    }
  
}