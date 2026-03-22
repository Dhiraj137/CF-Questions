import java.util.Scanner;
public class CP_1915C{
    public static boolean isPerfectSquare(long n){
        long x = (long)(Math.sqrt(n));
        return (x*x == n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long sum = 0;
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                sum += a;
            }
            if(isPerfectSquare(sum)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}