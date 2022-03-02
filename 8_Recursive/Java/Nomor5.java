import java.util.Arrays;

public class Nomor5 {
    public static void main(String[] args) {
        int element = Integer.MIN_VALUE, max_count=1, count=1;
        String arr[] = {"js", "js", "golang", "ruby", "ruby", "js", "js"};
        Arrays.sort(arr);
        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1])
                count++;

            if(arr[i] != arr[i-1] || i==arr.length-1){
                if(count>max_count){

                    max_count = count;
                    element = Integer.parseInt(arr[i-1]);
                }
                count =1;
            }
        }
        System.out.println(element+": "+max_count);
    }
}
