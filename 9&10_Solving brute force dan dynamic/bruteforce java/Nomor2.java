import java.util.ArrayList;
import java.util.ListIterator;

public class Nomor2 {
    public static void main(String[] args) {
        int input = 123;
        int[] money = { 1, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000 };
        ArrayList<Integer> moneyChange = new ArrayList<Integer>();
        for (int i = 0; i<money.length; i++) {
            if (input > money[i]) {
                //input = money[i];
                moneyChange.add(money[i]);
                //System.out.println(input);
            }
        }
        ListIterator li = moneyChange.listIterator(moneyChange.size());
        int changes = 0;
        while(li.hasPrevious()){
            int temp = (int) li.previous();
            if(temp<input){
                // System.out.println(temp);
                changes = changes+temp;
                System.out.println(changes);
             }
        }
    }
}
