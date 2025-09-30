import java.util.*;
public class A_Equal_Occurrences{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }

            int x = set.size();
            int[] freq = new int[x];
            for(int i = 1; i < n; i++){
                int count = 1;
                while(arr[i] == arr[i-1]){
                    i++;
                    count++;
                }
                freq[i] = count;
            }
            Arrays.sort(freq);
            int maxi = Integer.MIN_VALUE;
            for(int i = 0; i < freq.length; i++){
                maxi = Math.max(maxi,freq[i]*(freq.length-i));
            }
            System.out.println(maxi);
        }
    }
}