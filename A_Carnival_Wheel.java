import java.util.Scanner;

public class A_Carnival_Wheel{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int max = Integer.MIN_VALUE;    
            for(int i = 0; i <= l; i++){
                max = Math.max(max, (a+b*i)%l);
            }
            
            System.out.println(max);
        }
    }
}