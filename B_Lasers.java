import java.util.Scanner;
public class B_Lasers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            int[] arr1 = new int[n];
            int[] arr2 = new int[m];

            for(int i = 0; i< n; i++){
                arr1[i]  = sc.nextInt();
            }

            for(int i = 0; i< m; i++){
                arr2[i] = sc.nextInt();
            }

            System.out.println(n+m);
        }
    }
}