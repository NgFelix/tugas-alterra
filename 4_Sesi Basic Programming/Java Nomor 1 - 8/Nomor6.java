import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        int num = input.nextInt();
        System.out.print("n = ");
        int exp = input.nextInt();
        int answer = Pow(num, exp);
        System.out.println(answer);
    }
    public static int Pow(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }

        return result;
    }
}
