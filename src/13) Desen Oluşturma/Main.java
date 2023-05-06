import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Klavyeden sayı değerini aldık.
        System.out.print("Sayı : ");
        int number = input.nextInt();
        // pattern fonksiyonunda dönen değer outputMessage değişkeninde tutuldu.
        String outputMessage = pattern(number);

        System.out.println(outputMessage);

    }
    // output değişkeni pattern metodunda geri dönecek olan sonucu tutar.
    static String output="";
    // star değişkeni pattern metodu ilk başladığı anı tutar. barNumber değişkeni kontrol amaçlı geçici değişken.
    // constNumber değişkeni pattern metodua gönderilen ilk number değerini tutar.
    static int start = 0, barNumber,constNumber;
    static String pattern(int number){
        if(start==0){
            barNumber = number;
            constNumber = number;
        }
        if(barNumber>0){
            start = 1;
            output+=number+"\t";
            number = number - 5;
            barNumber = number;
            return pattern(number);
        }
        else{
            if(number<=constNumber){
                output+=number+"\t";
                number = number + 5;
            return pattern(number);
            }
        }
        return output;
    }
}
