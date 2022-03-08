import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = 0;
        int value2 = 0;
        int result;
        operationfunc CalcuFunction = new operationfunc();

        System.out.println("+++++++++++CALCULATOR+++++++++++");
        System.out.println("1: Open Calculator");
        System.out.println("99: Exit");
        System.out.print("Masukan Pilihan Anda : ");
        int choose = scanner.nextInt();
        if (choose == 1){
            System.out.println("+++++++++++CALCULATOR+++++++++++");
            System.out.print("Masukan Value 1 : ");
            value1 = scanner.nextInt();
            System.out.print("Masukan Value 2 : ");
            value2 = scanner.nextInt();
        }
        else if(choose == 99){
            return;
        }
        System.out.println("+++++++++++CALCULATOR+++++++++++");
        System.out.println("1. Add Value");
        System.out.println("2. Sub Value");
        System.out.println("3. Multiply Value");
        System.out.println("4. Divide Value");
        System.out.println("+++++++++++CALCULATOR+++++++++++");
        System.out.print("Masukan Pilihan Anda : ");
        int chooseOperation = scanner.nextInt();

        if (chooseOperation == 1){
            result = CalcuFunction.add(value1, value2);
            System.out.println(result);

        }
        else if (chooseOperation == 2){
            result = CalcuFunction.sub(value1, value2);
            System.out.println(result);

        }
        else if (chooseOperation == 3){
            result = CalcuFunction.multiply(value1, value2);
            System.out.println(result);

        }
        else if (chooseOperation == 4){
            result = CalcuFunction.divide(value1, value2);
            System.out.println(result);

        }

    }

    public static class operationfunc {
        public int add(int value1, int value2) {
            int result;
            result = value1 + value2;
            return result;
        }

        public int sub(int value1, int value2) {
            int result;
            result = value1 - value2;
            return result;
        }

        public int multiply(int value1, int value2) {
            int result;
            result = value1 * value2;
            return result;
        }

        public int divide(int value1, int value2) {
            int result;
            result = value1 / value2;
            return result;
        }

    }
}
