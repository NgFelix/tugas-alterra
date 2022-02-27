import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();;

        StringBuffer newStr =new StringBuffer();
        for(int i = str.length()-1; i >= 0 ; i--) {
            newStr = newStr.append(str.charAt(i));
        }
        if(str.equalsIgnoreCase(newStr.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan palindrome");
        }
    }
}
