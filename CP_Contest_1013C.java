import java.util.Scanner;
public class CP_Contest_1013C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n == 1){
                System.out.println(1);
            }else if(n %2 == 0){
                System.out.println(-1);
            }else{
                int[] arr= new int[n];
                arr[0] =1;
                for(int i = 1; i < arr.length; i++){
                    arr[i] = arr.length-i+1;
                }
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}