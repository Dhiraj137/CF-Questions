import java.util.Scanner;
public class CP_2035 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- > 0){
            long n = sc.nextLong();
            long m = sc.nextLong();
            long r = sc.nextLong();
            long c = sc.nextLong();

            System.out.println(m*(n-r) + (m-1)*(n-r) + (m-c));
        }
    }
}