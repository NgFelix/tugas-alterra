public class Nomor1 {
    public static String SimpleEq(int a,int b, int c){
        for(int i=1; i<=a; i++){
            for(int j=i+1; j<=a; j++){
                var k = a - (i+j);
                if(i * j * k == b && ((i*i) + (j*j) + (k*k) == c)){
                    var temp = i + " " + j + " " + k;
                    return temp;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(SimpleEq(6, 6, 14));

    }
}
