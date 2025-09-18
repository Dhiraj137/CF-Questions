import java.util.Scanner;
public class A_Theatre_Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        long hCount = n/a;
        if(n % a != 0){
            hCount++;
        }

        long vCount = m/a;
        if(m % a != 0){
            vCount++;
        }
        System.out.println(hCount*vCount);
    }
}