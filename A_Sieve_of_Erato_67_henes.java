import java.util.Scanner;

public class A_Sieve_of_Erato_67_henes{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            boolean prime = false;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == 67){prime = true;}
            }

            if(prime){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}