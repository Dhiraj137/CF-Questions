import java.util.Scanner;
public class A_Team{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count = 0;
        while(t-- > 0){
            int[] arr = new int[3];
            int one = 0;
            for(int i = 0; i < 3; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < 3; i++){
                if(arr[i] == 1){
                    one++;
                }
            }
            if(one >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}