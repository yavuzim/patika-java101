import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {   
       // Basamak sayısının kullanıcıdan alınan ve yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

        Scanner input = new Scanner(System.in);

        // Klavyeden n (basamak) bilgisini aldık.
        System.out.print("n : ");
        int n = input.nextInt();
        
        // Yıldızlarla üçgen çizme aşaması.
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }             
    }
}
