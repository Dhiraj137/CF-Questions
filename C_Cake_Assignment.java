import java.util.*;

public class C_Cake_Assignment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong(); 
            long x = sc.nextLong(); 
            ArrayList<Integer> list = new ArrayList<>();
            
            long target = 1L << k;  // 2^k, exact using bit shift
            
            while (x != target) {
                if (x < target) {
                    x = 2 * x;
                    list.add(1);
                } else {
                    x = 2 * x - (1L << (k + 1)); // 2^(k+1)
                    list.add(2);
                }
            }
            
            System.out.println(list.size());
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
