public class Nomor2 {
    public static void main(String[] args) {
        int n = 5, pertama = 0, kedua = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(pertama + ", ");
            int x = pertama + kedua;
            pertama = kedua;
            kedua = x;
        }
    }
}
