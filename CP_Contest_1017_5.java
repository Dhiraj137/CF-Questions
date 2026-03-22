import java.util.Scanner;
public class CP_Contest_1017_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0 ){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int[] bitcount = new int[30];

            // filling array
            for(int i = 0; i < n; i++){
                int ind = 0;
                int x = arr[i];
                while(x > 0){
                    if((x & 1) != 0){
                        bitcount[ind]++;
                    }
                    ind++;
                    x = x>>1;
                }
            }

            long maxSum = 0;

            for (int i = 0; i < n; i++) {
                long currentSum = 0;
                for (int j = 0; j < 30; j++) {
                    long power = (1L << j);
                    if ((arr[i] & power) != 0) {
                        currentSum += (n - bitcount[j]) * power;
                    } else {
                        currentSum += bitcount[j] * power;
                    }
                }
                maxSum = Math.max(maxSum, currentSum);
            }
            System.out.println(maxSum);
        }

    }
}
