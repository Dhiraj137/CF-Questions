import java.util.Scanner;
public class CP_2069A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            int x = n/3;
            for(int i = 0; i < n-2; i++){
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n-2; i++){
                if(arr[i] == 1){count++;}
            }
            if(count <= x){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
