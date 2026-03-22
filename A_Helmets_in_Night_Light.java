import java.util.*;

public class A_Helmets_in_Night_Light{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();

            int[][] arr = new int[n][2];
            for(int i = 0; i < n; i++) arr[i][0] = sc.nextInt();
            for(int i = 0; i < n; i++) arr[i][1] = sc.nextInt();

        // Use safe sorting
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        long sum = p;
        long people = n-1;

        for(int i = 0; i < n && people > 0; i++){
            if(arr[i][1] <= p){
                long give = Math.min(arr[i][0], people);
                sum += give * arr[i][1];
                people -= give;
            } else {
                break;
            }
        }
        sum += people * p;
        System.out.println(sum);

        }
    }
}