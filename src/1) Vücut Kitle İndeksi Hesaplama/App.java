import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {       
        // Vücut kitle indeksi hesaplayan program.

        Scanner input = new Scanner(System.in);

        System.out.print("Boy (m) : ");
        double boy = input.nextDouble(); // Boy bilgisini klavyeden aldık.
        System.out.print("Kilogram : ");
        int kilogram = input.nextInt(); // Kilogram bilgisini klavyeden aldık.

        double indeks = kilogram / Math.pow(boy, 2); // Vücut kitle indeksini hesapladık

        System.out.println("Vücut kitle indeksi : "+indeks); // Vücut kitle indeksini console ekranına yazdık.     
    }
}
