import java.util.Arrays;

public class Nomor4 {


        public static void main(String[] args) {
            int n = 3;
            int[] arr = {25000, 25000, 10000, 14000};
            int p = 50000;
            int k = 2;

            System.out.println(max.number(arr, n, p, k));
        }
    class max{
        static int number(int[] a, int n,
                          int p, int k)
        {Arrays.sort(a);
            int[] pre = new int[n];
            int val, i, j, ans = 0;
            pre[0] = a[0];
            if (pre[0] <= p)
                ans = 1;

            for(i = 1; i < k - 1; i++)
            {pre[i] = pre[i - 1] + a[i];
                if (pre[i] <= p)
                    ans = i + 1;
            }
            pre[k - 1] = a[k - 1];
            for(i = k - 1; i < n; i++)
            {if (i >= k)
                {pre[i] += pre[i - k] + a[i];
                }
                if (pre[i] <= p)
                    ans = i + 1;
            }
            return ans;
        }
    }

    }
