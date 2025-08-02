import java.util.Scanner;
public class CP_Contest_1013D{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();
            if(n >= k || m/k >= 2 ){
                System.out.println(1);
            }else if(m/k >=1 && m/k <= 2){
                System.out.println(1);
            }else if(n*m == k+1){
                System.out.println(Math.max(n,m));
            }else{
                long c = 0;
                long x = Math.min(n,m);
                while(k>1){
                    k = k-x;
                    c++;
                }
                System.out.println(c);
            }
        }
    }
}