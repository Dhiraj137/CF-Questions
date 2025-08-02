import java.util.Scanner;
public class CP_Contest_1017_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            int[] p = new int[2*n];
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    p[i+j+1] = matrix[i][j];
                }
            }

            int x = n*(2*n+1);
            int sum = 0;
            for(int i = 0; i < p.length; i++){
                sum += p[i];
            }
            p[0] = x-sum;

            for(int i = 0; i < p.length; i++){
                System.out.print(p[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
