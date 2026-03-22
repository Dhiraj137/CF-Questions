import java.util.Scanner;
public class A_Bear_and_Big_Brother{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int year = 0;
        while(a < b || a == b){
            a *=3;
            b *= 2;
            year++;
        }
        System.out.println(year);
    }
}