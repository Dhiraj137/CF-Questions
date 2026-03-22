import java.util.Scanner;

public class B_Strange_Machine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();

            char[] arr = s.toCharArray();
            long[] val = new long[q];

            for(int i = 0; i < q; i++) val[i] = sc.nextLong();

            int countB = 0;
            for(char ch: arr) if(ch == 'B') countB++;
            
            for(int i = 0; i < q; i++){
                long x = val[i];
                if(countB == 0){
                    System.out.println(x);
                    continue;
                }

                long steps = 0;
                int idx = 0;
                while (x > 0) {
                    if (arr[idx] == 'A') x -= 1;
                    else x /= 2;
                    steps++;
                    idx++;
                    if (idx == n) idx = 0;
                }
                System.out.println(steps);
            }
        }
    }
}