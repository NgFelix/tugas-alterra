import java.util.Arrays;

public class Nomor2 {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2};
        int result;
        System.out.println("Input : "+ Arrays.toString(nums));
        result = getSingleNumber(nums);
        System.out.println(result);
    }
    public static int getSingleNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
