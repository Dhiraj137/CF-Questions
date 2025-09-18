import java.util.Scanner;
public class A_Black_Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] val = new int[4];

        for(int i = 0; i < 4; i++){
            val[i] = sc.nextInt();
        }

        String str = sc.next();

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            count += val[ch-'1'];
        }
        System.out.println(count);

    }
}