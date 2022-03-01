public class Nomor6 {
    public static void main(String[] args) {
        int [] array = {2,1,5,1,3,2};
        int k = 3;
        int hasil = hitung(array,k);
        System.out.println(hasil);
    }

    public static int hitung(int [] array, int k){
        int max = 0;
        for(int i=0; i<array.length-k; i++){
            int sum = 0;
            for(int j=i; j<i+k; j++){
                sum = sum + array[j];
            }
            max = Math.max(sum, max);
        }
        return max;
    }
}
