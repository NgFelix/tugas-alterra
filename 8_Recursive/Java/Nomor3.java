public class Nomor3 {
    public static int Search(int [] input){
        int max = input[0];
        int min = input[0];
        int indexMin = 0;
        int indexMax = 0;
        for( int i=0; i< input.length; i++){
            if(input[i] > max){
                max = input[i];
            }
            if(input[i] < min){
                min = input[i];
            }
        }
        for(int i=0; i<input.length; i++){
            if(input[i] == max){
                indexMax = i;
            }
        }
        for(int i=0; i<input.length; i++){
            if(input[i] == min){
                indexMin = 1;
            }
        }
        System.out.println("min :" + min +" " + "index :" + indexMin);
        System.out.println("min :" + max +" " + "index :" + indexMax);
    return -1;
    }


    public static void main(String[] args) {
        int [] input = {5,7,4,-2,-1,8};
        Search(input);


    }
}
