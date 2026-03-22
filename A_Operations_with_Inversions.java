import java.util.Scanner;

public class A_Operations_with_Inversions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int cmax = 0;
            for(int i = 1; i < n; i++){
                if(max > arr[i])cmax++;
                max = Math.max(arr[i],max);
            }
            System.out.println(cmax);
        }
    }
}