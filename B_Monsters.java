import java.util.*;

public class B_Monsters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n];

            for(int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            ArrayList<long[]> list = new ArrayList<>();

            for(int i = 0; i < n; i++){
                long x = a[i] % k;
                if(x == 0){x = k;}

                list.add(new long[]{x,(long)i+1});
            }

            list.sort((x,y)->{
                if(x[0] != y[0]) {
                    return Long.compare(y[0],x[0]);
                }
                return Long.compare(x[1],y[1]);
            });

            for(long[] pair: list){
                System.out.print(pair[1] + " ");
            }
            System.out.println();
        }
    }
}