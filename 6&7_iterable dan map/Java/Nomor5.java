public class Nomor5 {

    public static int removeDuplicateElements(int arr[], int n){

        int count = 0;

        if (n==0 || n==1){
            return n;
        }
        for (int i=0; i<n-1; i++){
            if (arr[i] == arr[i+1]){
                count = count + 2;
                i = i+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 3, 6, 9, 9};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
            System.out.print(length);
    }
}
