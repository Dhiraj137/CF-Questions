import java.util.Scanner;
public class CP_1950B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            char arr[][] = new char[2*n][2*n];
            for(int i = 0; i < 2*n; i++){
                for(int j = 0; j < 2*n; j++){
                    if((i/2 + j/2 ) % 2 == 0){
                        arr[i][j] = '#';
                    }else{
                        arr[i][j] = '.';
                    }
                }
            }
            for(int i = 0; i < 2*n; i++){
                for(int j = 0; j < 2*n; j++){
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }
    }
}