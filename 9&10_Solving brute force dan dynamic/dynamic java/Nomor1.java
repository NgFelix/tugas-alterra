public class Nomor1 {

    public static int fib(int num){
        if(num == 0 || num == 1){
            return num;
        }
        else {
            return fib(num -1) + fib(num - 2);
        }
    }

    public static void main(String[] args) {
        int input = 5;
        int hasil = fib(input);
        System.out.println(hasil);
    }
}
