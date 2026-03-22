import java.util.Scanner;
public class A_Nearly_Lucky_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long lucky = 0;
        while(n > 0){
            long digit = n % 10;
            if(digit == 4 || digit == 7){
                lucky++;
            }
            n /= 10;
        }
        if(lucky == 4 || lucky == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }  
}