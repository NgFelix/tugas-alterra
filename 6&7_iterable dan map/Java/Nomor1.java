import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Nomor1 {
    public static void main(String[] args) {

        String [] Arr1 = {"kazuya","jin","lee"};
        String [] Arr2 = {"kazuya", "feng"};
        HashSet<String> hashSet = new LinkedHashSet<>(List.of(Arr1));

        List<String> ArrList = List.of(Arr2);
        boolean hasil = hashSet.addAll(ArrList);
        System.out.println(hashSet);

    }
}
