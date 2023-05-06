import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {       
        // Taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız 
        
        Scanner input = new Scanner(System.in);

        // Klavyeden taban sayısını aldık.
        System.out.print("Sayı : ");
        int number = input.nextInt();
 
        // Klavyeden üs sayısını aldık.
        System.out.print("Üs : ");
        int exponent = input.nextInt();
        // pow metodunundan geri dönen int değeri result değişkeninde tuttuk.
        int result = pow(number, exponent);
        System.out.println(result);
    }
    static int pow(int num, int exp){
        if(exp==0){
            return 1;
        }
        return num * pow(num, exp-=1);
    }
}