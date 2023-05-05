import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
        // Klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Scanner input = new Scanner(System.in);

        // Klavyeden N (adet) bilgisini aldık.
        System.out.print("N : ");
        int N = input.nextInt();

        String outputMessage;

        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        
        for(int i=1; i<=N; i++){
            System.out.println(i+". Sayıyı Giriniz : ");
            int number = input.nextInt();
            if(number<min){
                min = number;
            }
            else if(number>max){
                max = number;
            }            
        }      

        outputMessage = "Maksimum : " + max+" - Min : " + min;
        
        System.out.println(outputMessage);        
    }
}
