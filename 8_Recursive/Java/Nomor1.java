import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil, n,x;

        for (int i=2; i<=29; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                System.out.print(i+" ");
            }
        }
    }
}
