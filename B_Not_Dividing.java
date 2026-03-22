import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class B_Not_Dividing{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];

            String[] input = br.readLine().split(" ");
            for(int i = 0; i < n; i++){
                arr[i] = Long.parseLong(input[i]);
            }

            for (int i = 0; i < n; i++) if (arr[i] == 1) arr[i] = 2;

            for(int i = 1; i < n; i++){
                if(arr[i]  % arr[i-1] == 0){
                    arr[i]++;
                }
            }

            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}