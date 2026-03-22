import java.util.*;
public class D_Destruction_of_the_Dandelion_Fields{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
                int n = sc.nextInt();
                ArrayList<Long> even = new ArrayList<>();
                ArrayList<Long> odd = new ArrayList<>();

                for(int i = 0; i < n; i++){
                    long x = sc.nextLong();
                    if(x % 2 == 0){
                        even.add(x);
                    }else{
                        odd.add(x);
                    }
                }

                odd.sort(Collections.reverseOrder());

                long sum = 0;
                if(odd.isEmpty()){
                    System.out.println(0);
                }else{
                    for(long e: even) sum += e;
                    for(int i = 0; i < (odd.size()+1)/2; i++){
                        sum += odd.get(i);
                    }
                System.out.println(sum);
                }
        }
    }
}