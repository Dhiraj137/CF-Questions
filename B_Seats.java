import java.util.*;

public class B_Seats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();

            if (n <= 2) {
                System.out.println(1);
                continue;
            }

            // Handle edges
            if (s[0] == '0' && s[1] == '0') s[1] = '1';
            if (s[n - 1] == '0' && s[n - 2] == '0') s[n - 2] = '1';

            int cnt = 0;
            int prev = -1;

            for (int i = 0; i < n; i++) {
                if (s[i] != '1') {
                    if (i - prev >= 3) {
                        cnt++;
                        s[i] = '1';
                        prev = i;
                    }
                } else {
                    cnt++;
                    prev = i;
                }
            }

            System.out.println(cnt);
        }
    }
}
