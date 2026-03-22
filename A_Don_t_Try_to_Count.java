import java.util.Scanner;

public class A_Don_t_Try_to_Count{

    public static void isFormed(String x,String s, int n, int m){
        int count = 0;
        for(int i = 0; i < 6; i++){
            if(x.contains(s)){
                System.out.println(count);
                return;
            }

            x += x;
            count++;
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            isFormed(x, s, n, m);
        }
    }
}