import java.util.Scanner;

public class B_NIT_Destroys_the_Universe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            
            int start = -1;
            int last = -1;
            for(int i = 0; i < n; i++){
                if(arr[i] != 0){
                    start = i;
                    break;
                }
            }

            for(int i = n-1; i >= 0; i--){
                if(arr[i] != 0){
                    last = i;
                    break;
                }
            }
            boolean flag = false;
            if(start != -1){
                for(int i = start ; i <= last; i++){
                    if(arr[i] == 0){
                        flag = true;
                        break;
                    }
                }
            }

            if(start == -1){
                System.out.println(0);
            }else if(flag == true){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
    }
}