
import java.util.*;

public class Nomor4 {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,3,5,10,16};

        int len1 = arr1.length;
        int len2 = arr2.length;

        int x=0;

         int arrTemp[];
         int count;
     int Array(int length) { arrTemp = new int[length]; }
        public void printArray()
        {for (int i = 0; i < count; i++) {
            System.out.print(arrTemp[i] + " ");
            }
        }
        public void insert(int element)
        {if (arrTemp.length == count) {
            int newArr[] = new int[2 * count];
            for (int i = 0; i < count; i++) {
                    newArr[i] = arrTemp[i];
                }
                arrTemp = newArr;}
            arrTemp[count++] = element;
        }for(int i=0;i<len1;i++){
         boolean test = true;
            for(int j=0;j<len2;j++) {
                if(arr1[i]==arr2[j]){
                    test = false;
                    break;
                }
            }
            if(test == true) {
                insert(arr1[i]);
                x++;
            }
        }

        for(int k=0;k<len2;k++){

            boolean test = true;
            for(int l=0;l<len1;l++) {
                if(arr2[k]==arr1[l]){
                    test = false;
                    break;
                }
            }

            if(test == true) {
                insert(arr2[k]);
                x++;
            }
        }

        int len3 = arrTemp.length;
        for (int z =0;z<len3;z++){
            System.out.println(arrTemp[z]);
        }

    }
}
