public class Nomor3 {

    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 6};
        int x = 6;
        int size = A.length;

        if (pair.chkPair(A, size, x)) {
            System.out.println("Berhasil");
        }
        else {
            System.out.println("Gagal");
        }
        }
    }
    class pair{
     static boolean chkPair(int A[], int size, int x) {
            for (int i = 0; i < (size - 1); i++) {
                for (int j = (i + 1); j < size; j++) {
                    if (A[i] + A[j] == x) {
                        System.out.println("Target = " + x +
                                " is \n(" + i + ", " + j + ")");
                        return true;
                    }
                }
            }
            return false;
        }
}
