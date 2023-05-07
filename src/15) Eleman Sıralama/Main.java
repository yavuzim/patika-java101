import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        // Dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

        Scanner input = new Scanner(System.in);

        // Dizinin eleman sayısını klavyeden aldık.
        System.out.print("Dizi Eleman Sayısı : ");
        int length = input.nextInt();

        int[] numbers = inputArr(length,input);
        numbers = sort(numbers);

        print(numbers);

    } 
    static int[] sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int index = 0;
            boolean flag = false;
            int min = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(min>arr[j]){
                    min = arr[j];
                    index = j;
                    flag = true;
                }
            }
            if(flag){
                int bar = arr[index];
                arr[index] = arr[i];
                arr[i] = bar;
            }
        }       
        return arr;
    }
    static void print(int[] arr){
        for(int number : arr){
            System.out.println(number);
        }
    }
    static int[] inputArr(int length,Scanner input){
        // length uzunluğunda dizi oluşturduk.
        int[] numbers = new int[length];

        // Dizi elemanlarını klavyeden girdik.
        for(int i=0; i<numbers.length; i++){
            System.out.print(i+". indis = ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
}
