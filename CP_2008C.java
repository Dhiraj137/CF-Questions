import java.util.Scanner;
public class CP_2008C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long l = 1;
            int ans = 1;
            long r = (long) Math.pow(10,9);
            long val = (y-x+1);
            while(l <= r){
                long mid = l + (r-l)/2;
                long n = ((mid*mid) - mid + 2)/2;
                if(val < n){
                    r = mid-1;
                }else{
                    ans = (int)mid;
                    l = mid+1;
                }
            }
            System.out.println(ans);
        }
    }
}