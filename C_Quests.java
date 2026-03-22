import java.util.Scanner;

public class C_Quests{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();

            int[] a = new int[(int) n];
            int[] b= new int[(int) n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }

           long sum = 0;
           long ans = 0;
           int maxi = 0;

           for(int i = 0; i < Math.min(n,k); i++){
            sum += a[i];
            maxi = Math.max(maxi,b[i]);
            ans = Math.max(ans,sum+(k-i-1)*maxi);
           }

           System.out.println(ans);

        }
    }
}