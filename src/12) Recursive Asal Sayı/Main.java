import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {       
        // Recursive metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
        
        Scanner input = new Scanner(System.in);

        // Klavyeden sayısı bilgisini aldık.
        System.out.print("Sayı : ");
        int number = input.nextInt();
        int isPrime = primeNumbers(number);
        String outputMessage;
        if(isPrime==1){
            outputMessage = number+" Sayısı Asaldır.";
        }
        else{
            outputMessage = number+" Sayısı Asal Değildir.";
        }
        System.out.println(outputMessage);
    }
    // n değişkeni her defasında azalan num değerini, m değişkeni ise sabit num değerini tutar.
    static int n=0,m;
    // return 1 = Asal, return 0 = asal değil.
    static int primeNumbers(int num){
        if(num==2){
            return 1;
        }
        else if(num<2){
            return 0;
        }
        else{
            if(n == 0){
                m = num;
            }
            if(n>2 && m % n == 0){
                return 0;
            }
        }
        n = num-1;
        return primeNumbers(n);        
    }
}