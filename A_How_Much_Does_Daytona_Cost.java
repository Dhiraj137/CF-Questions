import java.util.*;
public class A_How_Much_Does_Daytona_Cost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                map.put(x,map.getOrDefault(x,0)+1);
            }

            if(map.containsKey(k)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            map.clear();
        }
    }
}