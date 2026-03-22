import java.util.Scanner;

public class C_Vasilije_in_Cacak{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = sc.nextLong();

            if((n*(n+1)/2) < x){
                System.out.println("NO");
            }else{
                long sumMin = 0;
                long sumMax = 0;
                for(long i = 1; i <= k; i++){
                    sumMin += i;
                }

                for(long i = n; i >= k; i--){
                    sumMax += i;
                }

                if(sumMin > x && sumMax < x){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
    }
}