import java.util.Scanner;
public class CP_1886A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if( n < 7 || n == 9){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                int x = 1;
                int y = 2;
                int z = n-3;
                if(z % 3 == 0){
                    z -= 2;
                    y += 2;
                }
                System.out.println(x+" "+y+" "+z);

            }

        }
    }
}
