import java.util.Scanner;

public class A_Pizza_Time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            System.out.println((long)(n-1)/2);
        }
    }
}