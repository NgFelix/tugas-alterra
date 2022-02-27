import java.util.Scanner;

public class Nomor2{
    public static void main(String[] args) {
        System.out.println(Pow(2,3));
    }
    public static int Pow(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }

        return result;
    }
}