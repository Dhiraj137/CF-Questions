import java.util.*;
public class B_Abraham_s_Great_Escape {
    public static void asquare(int n, long k) {
        if ((long) n * n - 1 == k) {
            System.out.println("NO");
            return;
        }

        char[][] grid = new char[n][n];
        System.out.println("YES");
        // Fill grid with 'R' and 'L'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - 1) grid[i][j] = 'L';
                else grid[i][j] = 'R';
            }
        }

        long c = 0;
        int i = 0, j = 0;

        while (c < k) {
            grid[i][j] = 'L';
            j++;
            c++;
            if (j == n) {
                j = 0;
                i++;
            }
        }

        if ((k % n) == (n - 1)) {
            int row = (int) (k / n);
            grid[row][n - 1] = 'D';
            grid[row + 1][n - 1] = 'U';
        }

        // Print grid
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            asquare(n, k);
        }
        sc.close();
    }
}
