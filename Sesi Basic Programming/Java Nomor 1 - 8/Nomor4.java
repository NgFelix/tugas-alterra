import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        boolean n = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                n = true;
                break;
            }
        }
        if (!n)
            System.out.println("Bilangan Prima");
        else
            System.out.println("Bukan Bilangan Prima");
    }
}
