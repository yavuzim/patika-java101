import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   

        // Kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran program.

        Scanner input = new Scanner(System.in);

        String[][] urunler = {{"Armut","2.14"},{"Elma ","3.67"},{"Domates ","1.11"},{"Muz","0.95"},{"Patlıcan ","5.00"}};
        
        double toplamFiyat = 0.0;

        for(int i=0; i<urunler.length; i++){
                System.out.print(urunler[i][0]+" Kaç Kilo ? : ");
                double kilogram = input.nextDouble();
                System.out.println("kilogram : "+kilogram);
                double fiyat = Double.parseDouble(urunler[i][1]);
                toplamFiyat = toplamFiyat + fiyat * kilogram;
        }
        System.out.println("Toplam Tutar : "+toplamFiyat);
    }
}
