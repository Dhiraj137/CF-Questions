import java.io.*;
import java.util.*;

public class B_Beautiful_Numbers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static float nextFloat() throws IOException {
        return Float.parseFloat(next());
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return br.readLine();
    }

    public static void main(String[] args) throws Exception {
        int t = nextInt();
        while (t-- > 0) {

            ArrayList<Integer> list = new ArrayList<>();
            String str = next();
            int sum = 0;

            for(int i = 0; i < str.length(); i++){
                int x = str.charAt(i) - '0';
                sum += x;
                list.add(x);
            }

            if(str.length() == 1 || sum < 10){
                System.out.println(0);
                continue;
            }
            
            int y = list.get(0);
            list.set(0,y-1);
            Collections.sort(list,Collections.reverseOrder());

            int target = sum - 9;
            int count = 0;
            for(int i = 0; i < list.size(); i++){
                if(target <= 0){
                    break;
                }
                count++;
                target -= list.get(i);
            }
            System.out.println(count);
        }
    }
}