  import java.util.Scanner;
  class Main {   
    public static void main(String[] args) {             
      Scanner scan = new Scanner(System.in);
      System.out.print("Doğum Yılınızı Giriniz : ");
      int dogumTarih=scan.nextInt();
      int kalan=dogumTarih%12;
      String burc="";
      switch(kalan){
        case 0: burc="Maymun"; break;
        case 1: burc="Horoz"; break;
        case 2: burc="Köpek"; break;
        case 3: burc="Domuz"; break;
        case 4: burc="Fare"; break;
        case 5: burc="Öküz"; break;
        case 6: burc="Kaplan"; break;
        case 7: burc="Tavşan"; break;
        case 8: burc="Ejderha"; break;
        case 9: burc="Yılan"; break;
        case 10: burc="At"; break;
        case 11: burc="Koyun"; break;
      }
      System.out.print("Çin Zodyağı Burcunuz : "+burc);
    }
  
}