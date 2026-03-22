import java.util.*;

public class A_United_We_Stand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);
            int count = 1;
            long num = arr[arr.length-1];
            for(int i = arr.length-2; i >= 0; i--){
                if(arr[i] == num){
                    count++;
                }
            }
            if(count == arr.length){
                System.out.println(-1);
            }else{
                System.out.print(arr.length-count + " ");
                System.out.println(count);
                for(int i = 0; i < arr.length-count; i++){
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
                while(count-- > 0){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}