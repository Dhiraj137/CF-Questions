import java.util.*;

public class A_Little_Fairy_s_Painting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Set<Integer> num = new HashSet<>();

            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                max = Math.max(x,max);
                num.add(x);
            }

            int y = num.size();
            for(int i = y; i <= max; i++){
                if(num.contains(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}