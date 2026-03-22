import java.util.*;

public class D_Distinct_Split{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            Set<Character> s1 = new HashSet<>();
            Set<Character> s2 = new HashSet<>();
            
            int[] pre = new int[n];
            int[] suff = new int[n];

            for(int i = 0; i < n; i++){
                s1.add(s.charAt(i));
                pre[i] = s1.size();
            }
            for(int i = n-1; i >= 0; i--){
                s2.add(s.charAt(i));
                suff[i] = s2.size();
            }

            int max = 0;
            for(int i = 0; i < n-1; i++){
                max = Math.max(pre[i]+suff[i+1],max);
            }
            System.out.println(max);
        }
    }
}