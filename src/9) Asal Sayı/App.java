public class App {
    public static void main(String[] args) throws Exception {
        //  1 - 100 arasındaki asal sayıları ekrana yazdıran programı.

        boolean flag = true;
        System.out.print("1 - 100 arası asal sayılar => ");
        for(int i=2; i<100; i++){
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }
            if(flag){
                System.out.print(i+" , ");
            }
        }
        
       
    }
}
