import java.util.Scanner;
public class CP_Contest_1013A{
    public static void main(String args[]){
        check();
    }
    public static void check(){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0){
            int pos = 0;
            int n = sc.nextInt();
            int[] arr = new int[10];
            for(int i = 0; i < n; i++){
                int a = sc.nextInt();
                arr[a]++;
                if(arr[0] >= 3 && arr[2] >= 2 && arr[1] >= 1 && arr[3] >= 1 && arr[5] >= 1 && pos == 0){
                    pos = i+1;
                }
            }
            System.out.println(pos);

        }
        sc.close();
    }

}