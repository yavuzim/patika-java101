import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        //  çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan program.
        Scanner input = new Scanner(System.in);

        // n ve m değerlerini klavyeden aldık.
        System.out.print("n : ");
        int n = input.nextInt();
        System.out.print("m : ");
        int m = input.nextInt();

        int[][] matrix = new int[n][m];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(i+". satır "+j+". sütun : ");
                matrix[i][j] = input.nextInt();
            }
        }
        print(matrix);

        System.out.println("#########################################################");

        int[][] returnMatrix = transpose(matrix);

        print(returnMatrix);

    }    
    static int[][] transpose(int[][] matrix){
        int[][] arr = new int[matrix[0].length][matrix.length];
        int col = 0, j = 0;
        for(int i=0; i<arr.length; i++){
            for(int k=0; k<matrix.length; k++){
                arr[i][j] = matrix[k][col];
                j++;
            }
            col++;
            j = 0;
        }
        return arr;
    }
    static void print(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
