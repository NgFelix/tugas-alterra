public class Nomor4 {
    public static void main(String[] args) {
        int input = 2;
        String [] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int [] num = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String strrom = "";

        if(input > 0 && input < 4000){
            for (int i = 0; i<13; i++){
                while (input >= num[i]){
                    input = input - num[i];
                    strrom = strrom + rom[i];
                }
            }
            System.out.println(strrom);

        }
        else {
            System.out.println("error");
        }
    }
}
