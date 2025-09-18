import java.util.Scanner;
public class CP_1512A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int x = arr[0];
            int y = arr[1];
            int z = arr[2];
            int common = -1;
            if(x == y){
                common = x;
            }else if(x == z){
                common = x;
            }else{
                common = y;
            }

            for(int i = 0; i < n; i++){
                if(arr[i] != common){
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}