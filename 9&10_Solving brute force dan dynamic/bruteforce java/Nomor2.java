import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Nomor2 {
    public static List<Integer> change(int money){
        var c2 = List.of(10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 1);
        List<Integer> result = List.of();
        for (var c : c2){
            while(money>=c){
                result.add(money);
                money = money - c;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(change(534));
    }
}
