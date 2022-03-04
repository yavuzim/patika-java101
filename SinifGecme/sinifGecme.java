  import java.util.Scanner;
  class Main {
    static boolean kontrol(int mat,int fizik,int turkce,int kimya){
      if(mat<0 || mat>100 || fizik<0 || fizik>100 || turkce<0 || turkce>100 || kimya<0 || kimya>100)
        return false;
      return true;
    }
    public static void main(String[] args) {     
     Scanner scan = new Scanner(System.in);
      int mat=-1,fizik=-1,turkce=-1,kimya=-1;
      while(!kontrol(mat,fizik,turkce,kimya)){
         System.out.print("Matematik : ");
         mat=scan.nextInt();
         System.out.print("Fizik : ");
         fizik=scan.nextInt();
         System.out.print("Türkçe : ");
         turkce=scan.nextInt();
         System.out.print("Kimya : ");
         kimya=scan.nextInt();
        if(!kontrol(mat,fizik,turkce,kimya)) System.out.println("0-100 aralığında not giriniz!");
      }
     String mesaj="";
     double ort = (mat+fizik+kimya+turkce)/4;
      if(ort<55) mesaj=ort+" notuyla kaldınız!";
      else mesaj=ort+" notuyla geçtiniz! Tebrikler...";
      System.out.println(mesaj);
    }
}