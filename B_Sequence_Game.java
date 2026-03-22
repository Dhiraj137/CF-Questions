import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_Sequence_Game{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            long[] b = new long[n];
            for(int i = 0; i < n; i++){
                b[i] = Long.parseLong(input[i]);
            }

            int count = b.length;
            for(int i = 1; i < n; i++){
                if(b[i] < b[i-1]) count++;
            }

            System.out.println(count);
            System.out.print(b[0] + " ");
            for(int i = 1; i < n; i++){
                if(b[i] < b[i-1]){
                    System.out.print(1 + " ");
                }
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }
}