import java.util.*;

public class B_Bitwise_Reversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            boolean a = x % 2 == 0 && y % 2 == 0;
            boolean b = a && z % 2 == 0;
            if(b){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}