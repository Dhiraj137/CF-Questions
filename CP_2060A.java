import java.util.Scanner;

public class CP_2060A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            int count = 0;
            for (int a3 = -99; a3 <= 200; a3++) {
                boolean a = (a3 == a1 + a2);
                boolean b = (a3 == a4 - a2);
                boolean c = (a3 == a5 - a4);

                // Count how many of a, b, and c are true
                int trueCount = 0;
                if (a) trueCount++;
                if (b) trueCount++;
                if (c) trueCount++;

                // Update count if trueCount is greater
                count = Math.max(count, trueCount);
            }
            System.out.println(count);
        }
    }
}
