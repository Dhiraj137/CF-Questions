import java.util.*;

public class C_Traffic_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            String s = sc.next();

            if (c == 'g') {
                System.out.println(0);
                continue;
            }

            String ss = s + s;
            int lastG = -1;
            int ans = 0;

            for (int i = ss.length() - 1; i >= 0; i--) {
                if (ss.charAt(i) == 'g') {
                    lastG = i;
                }
                if (i < n && ss.charAt(i) == c) {
                    ans = Math.max(ans, lastG - i);
                }
            }

            System.out.println(ans);
        }
    }
}
