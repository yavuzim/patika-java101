import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
       /*
         Mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan program.
    * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
    * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre 
    müşteriye aşağıdaki indirimleri uygulayın;
            - Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
            - Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
            - Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            - Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            - Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

         Scanner input = new Scanner(System.in);

         // Bilet bilgileri girildi.
         System.out.print("Mesafe : ");
         int mesafe = input.nextInt();
         System.out.print("Yaş : ");
         byte yas = input.nextByte();
         System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
         byte tip = input.nextByte();
 
         // .giriş bilgileri kontrol edildi.
         if(mesafe<0 || yas<0 || tip<0 || tip>2){
             System.out.println("Hatalı Değer!");
         }
         else{   
         // Bilet Fiyatı hesabı yapıldı.         
         double mesafaBasiUcret = 0.10;
 
         double biletFiyat = mesafaBasiUcret * mesafe;
 
         if(tip==2){
             biletFiyat = (biletFiyat*80/100)*2;
         }
         if(yas<=12){
             biletFiyat = biletFiyat*50/100;
         }
         else if(yas>12 && yas<=25){
             biletFiyat = biletFiyat*90/100;
         }
         else if(yas>=65){
             biletFiyat = biletFiyat*70/100;
         }
         System.out.println("Toplam Tutar : "+biletFiyat);
         }        
       
              
    }
}
