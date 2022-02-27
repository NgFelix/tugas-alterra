import java.util.Scanner;

public class Nomor1 {
    static boolean primeNumber(int input){
        int num;
        num = input;
        boolean n = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                n = true;
                break;
            }
        }
        if (!n) {
            System.out.println("Bilangan Prima");
            return true;
        }
        else
            System.out.println("Bilangan Non-Prima");
            return false;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(1));
        System.out.println(primeNumber(100));
    }
}
