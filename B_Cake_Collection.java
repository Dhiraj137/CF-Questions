import java.util.*;
public class B_Cake_Collection{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();

            int[] arr = new int[(int)n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int ind = (int)n-1;
            long sum = 0;
            while(m > 0 && ind >=0){
                sum += m*arr[ind];
                m--;
                ind--;
            }
            System.out.println(sum);
        }
    }
}