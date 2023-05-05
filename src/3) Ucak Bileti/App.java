import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
      
        // Kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

        Scanner input = new Scanner(System.in);

        // Verileri animals dizisinde tuttuk.
        String[] animals = {"Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun"};

        // Klavyeden doğum tarihi bilgisini aldık.
        System.out.print("Doğum Tarihi : ");
        int dateBirth = input.nextInt();

        // kalan hesabı yaptık.
        byte mod = Byte.parseByte(String.valueOf(dateBirth % 12));

        // outputMessage değişkeninde ekrana yazılacak veriyi tuttuk.
        String outputMessage = animals[mod];

        // Çıktıyı ekranda gösterdik.
        System.out.println(outputMessage);
              
    }
}
