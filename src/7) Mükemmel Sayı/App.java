import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
        /*
         * Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” 
         * Değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı yazınız.
         */

        Scanner input = new Scanner(System.in);

        // Klavyeden sayı bilgisini aldık.
        System.out.print("Sayi : ");
        int number = input.nextInt();

        String outputMessage;

        int sum = 0;
        
        for(int i=1; i<number; i++){           
            if(number % i == 0){
                sum += i;
            }          
        }      

        if(sum==number){
            outputMessage = number+" Mükemmel sayıdır";
        }
        else{
            outputMessage = number+" Mükemmel sayı değildir.";
        }
        
        System.out.println(outputMessage);   
    }
}
