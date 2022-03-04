  import java.util.Scanner;
  class Main {
   
    public static void main(String[] args) {     
     Scanner scan = new Scanner(System.in);
      int s1=0,s2=0,s3=0; 
      while(s1==s2 || s1==s3 || s2==s3){
        System.out.print("Sayı 1 : ");
        s1=scan.nextInt();
        System.out.print("Sayı 2 : ");
        s2=scan.nextInt();
        System.out.print("Sayı 3 : ");
        s3=scan.nextInt();
        if(s1==s2 || s1==s3 || s2==s3) System.out.print("Sayılar farklı olmalı!");
      }
      String durum;
      if(s1>s2 && s1>s3 && s2>s3) 
        durum=s1+">"+s2+">"+s3;
      else if(s1>s2 && s1>s3 && s2<s3)
        durum=s1+">"+s3+">"+s2;
      else if(s1<s2 && s1>s3 && s2>s3)
        durum=s2+">"+s1+">"+s3;
      else if(s1<s2 && s1<s3 && s2>s3)
        durum=s2+">"+s3+">"+s1;
      else if(s1>s2 && s1<s3 && s2<s3)
        durum=s3+">"+s1+">"+s2;
      else durum=s3+">"+s2+">"+s1;
      System.out.print(durum);

      
     
     
    }
}