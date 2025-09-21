import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class B_Maximum_Cost_Permutation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int[] p = new int[n];
            boolean[] check = new boolean[n];
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.fill(check,false);

            for(int i = 0; i < n; i++){
                p[i] = sc.nextInt()-1;
                
                if(p[i] == -1){
                    list.add(i);
                }else{
                    check[p[i]] = true;
                }
            }

            if(list.size() == 1){
                int unused = 0;
                for(int i = 0; i < n; i++){
                    if(!check[i]){
                        unused = i;
                        break;
                    }
                }
                p[list.get(0)] = unused;
            }

            int l = 0, r = n-1;
            while(l < n && p[l] == l)l++;
            while(r >= 0 && p[r] == r)r--;
            System.out.println(Math.max(0,r-l+1));
        }
    }
}