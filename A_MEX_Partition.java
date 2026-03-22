import java.util.*;

public class A_MEX_Partition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            boolean[] check = new boolean[n+1];
            Arrays.fill(check,false);

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                check[arr[i]] = true;
            }
            Arrays.sort(arr);
            if(arr[0] == 0){
                for(int i = 0; i < check.length; i++){
                    if(!check[i]){
                        System.out.println(i);
                        break;
                    }
                }
            }else{
                System.out.println(0);
            }
        }
    }
}