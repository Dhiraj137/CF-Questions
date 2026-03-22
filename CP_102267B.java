import java.util.Scanner;
public class CP_102267B {
    public static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n-2)){
            System.out.println(2 + " " + (n-2));
        }else{
            System.out.println(-1);;
        }

    }
}