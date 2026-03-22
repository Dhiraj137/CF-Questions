import java.util.Scanner;
public class A_Beautiful_Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int row = -1;
        int col = -1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    row = i;
                    col = j;
                }
            }
        }
        row += 1;
        col += 1;
        System.out.println(Math.abs(row-3)+Math.abs(col-3));
    }
}