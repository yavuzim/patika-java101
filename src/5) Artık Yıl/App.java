import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
        // Kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

        Scanner input = new Scanner(System.in);

        // Klavyeden yıl bilgisini aldık.
        System.out.print("Yıl : ");
        int date = input.nextInt();

        String outputMessage;
        
        if(date % 100 == 0){
            if(date % 400 == 0){
                outputMessage = date + " bir artık yıldır !";
            }
            else{
                outputMessage = date + " bir artık yıldır değildir !";
            }
        }
        else{
            if(date % 4 == 0){
                outputMessage = date + " bir artık yıldır !";
            }
            else{
                outputMessage = date + " bir artık yıldır değildir !";
            }
        }
        
        System.out.println(outputMessage);        
    }
}
