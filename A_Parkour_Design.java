import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Parkour_Design{
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

    public static void main(String[] args) throws Exception{
        int t = nextInt();
        while(t-- > 0){
            long x = nextLong();
            long y = nextLong();

            if(y > 0){
                if(x >= 2*y && (x-2*y) % 3== 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else if(y < 0){
                if(x >= 4*Math.abs(y) && (x-4*Math.abs(y)) % 3== 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                if(x % 3== 0){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}