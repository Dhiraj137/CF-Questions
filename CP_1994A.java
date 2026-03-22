import java.util.Scanner;
public class CP_1994A{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-- > 0){
         int n = sc.nextInt();
         int m = sc.nextInt();

         int old_arr[][] = new int[n][m];

         for(int i = 0; i < n; i++){
             for(int j = 0; j< m; j++){
                 old_arr[i][j] = sc.nextInt();
             }
         }
         int new_arr[][] = new int[n][m];

         for(int i = 0; i < n; i++){
             for(int j = 0; j< m; j++){
                 if(j != m-1){
                     new_arr[i][j] = old_arr[i][m-(m-j-1)];
                 }else {
                     new_arr[i][j] = old_arr[i][0];
                 }
             }
         }

         for(int i = 0; i < n; i++){
             for(int j = 0; j< m; j++){
                 old_arr[i][j] = new_arr[i][j];
             }
         }
         for(int i = 0; i < n; i++){
             for(int j = 0; j< m; j++){
                 if(i != n-1){
                     new_arr[i][j] = old_arr[i+1][j];
                 }else{
                     new_arr[i][j] = old_arr[0][j];
                 }
             }
         }
         if((n == 0 && m == 0) || (n == 1 && m == 1)){
             System.out.println(-1);
         }
         else if((n == 0 && m == 1) || (m == 0 && n == 1)){
             System.out.println(-1);
         }else{
             for(int i = 0; i < n; i++){
                 for(int j = 0; j< m; j++){
                     System.out.print(new_arr[i][j] + " ");
                 }
                 System.out.println();
             }
         }
     }
    }
}