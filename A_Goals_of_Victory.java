import java.util.Scanner;

public class A_Goals_of_Victory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            long sum = 0;
            while(n-- > 1){
                long x = sc.nextLong();
                sum += x*(-1);
            }
            System.out.println(sum);
        }
    }
}