import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int vokal = 0;
        int konso = 0;
        int count = 0;


        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char huruf = str.charAt(i); if(huruf == 'a' || huruf == 'e' || huruf == 'i' || huruf == 'o' || huruf == 'u'){
                vokal++;
            }
            else if((huruf >= 'a'&& huruf <= 'z')){
            konso++;
        }
        }
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
                count++;
        }
        System.out.println("Jumlah Vokal : " + vokal);
        System.out.println("Jumlah Konsonan : " + konso);
        System.out.println("Total Karakter : " + count);
    }
}
