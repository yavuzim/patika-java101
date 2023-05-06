import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {       
        //  Eleman sayısının kullancıdan alındığı fibonacci serisi. 
        
        Scanner input = new Scanner(System.in);

        // Klavyeden eleman sayısını aldık.
        System.out.print("Eleman Sayısı : ");
        int n = input.nextInt();
        
        // Fibonacci ilk 2 eleman.
        int x = 1, y = 1;
        // İlk 2 elemanı değişkende tuttuk.
        String outputMessage = x+"\t"+y+"\t";
 
        for(int i=1; i<=n-2; i++){
            int sum = x + y;
            x = y;
            y = sum;
            outputMessage += sum+"\t";
        }
        System.out.println(outputMessage);
    }
}