  import java.util.Scanner;
  class Main {
    public static void main(String[] args) {     
      Scanner scan = new Scanner(System.in);
      String k="yavuzim",s="1234";
      System.out.print("Kullanıcı Adı : ");
      String kullaniciAd = scan.nextLine();
      System.out.print("Şifre : ");
      String sifre = scan.nextLine();
      String mesaj="";
      if(kullaniciAd.equals(k) && sifre.equals(s)) mesaj="Sisteme Giriş Yapıldı!";
      else if(!kullaniciAd.equals(k) && sifre.equals(s))
        mesaj="Kullanıcı Adı Yanlış!";
      else if(kullaniciAd.equals(k) && !sifre.equals(s)){
        System.out.print("Şifre Yanlış! Şifrenizi sıfırlamak ister misiniz? (e/h) : ");
       String cevap = scan.nextLine();
        if(cevap.equals("h")) mesaj="Şifre Değiştirilmedi, Giriş Yap";
        else{
          System.out.print("Yeni Şifre : ");
          String yeniSifre=scan.nextLine();
          if(yeniSifre.equals(s)) mesaj="Şifre Oluşturulmadı!";
          else mesaj="Şifre Oluşturuldu!";
        }
      }
      else mesaj="Kullanıcı Adı ve Şifre Yanlış!";
      System.out.println();
     System.out.print(mesaj);
      
    }
}