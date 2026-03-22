import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_ABAB_Construction{
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

    public static void main(String args[]) throws Exception{
        int t = nextInt();

        while(t-- > 0){
            int n  = nextInt();
            String x = next();
            StringBuilder s = new StringBuilder("");

            for(int i = 1; i <= n; i++){
                if(i % 2 == 1){
                    s.append('a');
                }else{
                    s.append('b');
                }
            }
            
            int left = 0; 
            int right = n-1;
            StringBuilder A = new StringBuilder("");
            for(int i = 0; i < n; i++){
                if(x.charAt(i) == 'a'){
                    if(s.charAt(left) == 'a'){
                        left++;
                        A.append('a');
                    }else if(s.charAt(right) == 'a'){
                        A.append('a');
                        right--;
                    }else{
                        System.out.println("NO");
                        break;
                    }
                }else if(x.charAt(i) == 'b'){
                    if(s.charAt(left) == 'b'){
                        left++;
                        A.append('b');
                    }else if(s.charAt(right) == 'b'){
                        A.append('b');
                        right--;
                    }else{
                        System.out.println("NO");
                        break;
                    }
                }else{
                    if(i != n-1){
                        if(x.charAt(i+1) == s.charAt(left)){
                            A.append(s.charAt(right));
                            right--;
                        }else if(x.charAt(i+1) == s.charAt(right)){
                            A.append(s.charAt(left));
                        }else{
                            System.out.println("NO");
                            break;
                        }
                    }else{
                        A.append(s.charAt(left));
                        left--;
                    }
                }
            }
        }
    }

}