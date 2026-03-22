import java.util.Scanner;

public class CP_1149A {
    public static void prefix_sum_primes(int n, Scanner sc){
        int one = 0;
        int two = 0;

        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            if(a == 1){
                one++;
            } else {
                two++;
            }
        }

        if (two > 0 && one > 0) {
            System.out.print("2 1 ");
            two--;
            one--;
        }

        while(two-- > 0) {
            System.out.print("2 ");
        }

        while(one-- > 0) {
            System.out.print("1 ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prefix_sum_primes(n, sc);
    }
}
