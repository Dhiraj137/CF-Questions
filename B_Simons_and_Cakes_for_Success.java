import java.util.*;

public class B_Simons_and_Cakes_for_Success{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    list.add(i);
                }
            }

            long product = 1;
            for(int i = 0; i < list.size(); i++){
                product *= list.get(i);
            }
            System.out.println(product);
        }
    }
}