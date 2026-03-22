import java.util.*;

public class B_Basketball_Together{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long d = sc.nextLong();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        if(arr[0] > d){
            System.out.println(n);
        }else{
            int left = -1;
            int right = n-1;
            int teams = 0;
            int teamsize = 1;
            while(left < right){
                if(arr[right]*teamsize <= d && left < right){
                    left++;
                    teamsize++;
                }else{
                    right--;
                    teams++;
                    teamsize = 1;

                }
            }

            System.out.println(teams);
        }
    }
}