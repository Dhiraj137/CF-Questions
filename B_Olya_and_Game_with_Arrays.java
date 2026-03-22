import java.util.*;

public class B_Olya_and_Game_with_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<long[]> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                long[] arr = new long[m];
                for (int j = 0; j < m; j++) {
                    arr[j] = sc.nextLong();
                }
                Arrays.sort(arr);
                list.add(arr);
            }

            long min = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                min = Math.min(min, list.get(i)[0]);
            }

            long secondmin = Long.MAX_VALUE;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (list.get(i).length > 1) {
                    secondmin = Math.min(secondmin, list.get(i)[1]);
                    sum += list.get(i)[1];
                } else {
                    sum += list.get(i)[0];
                    secondmin = Math.min(secondmin, list.get(i)[0]);
                }
            }

            System.out.println(sum + min - secondmin);
        }
    }
}
