import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan program.
        Scanner input = new Scanner(System.in);

        // Dizinin eleman sayısını klavyeden aldık.
        System.out.print("Dizi Uzunluğu : ");
        int length = input.nextInt();

        int[] numbers = inputArr(length,input);
        System.out.println(frequency(numbers));

    } 
    static int[] inputArr(int length,Scanner input){
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            System.out.print(i+". indis : ");
            arr[i] = input.nextInt();
        }
        return arr;
    }
    static String frequency(int[] arr){
        int counter = 1;
        String outputMessage = "";
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                // 0 harici değerlerde if'in içine dallanır.
                if(arr[j]!=0 && arr[i]==arr[j]){
                    counter++;
                    // Tekrar edilen sayıları bir daha saymamak için 0 değerini ekledik.
                    arr[j] = 0;
                }
            }
            if(arr[i]!=0){
                outputMessage+=arr[i]+" sayısı "+counter+" tekrar edildi.\n";
            }            
            counter = 1;
        }
        return outputMessage;
    }
}
