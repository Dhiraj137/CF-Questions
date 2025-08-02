import java.util.Scanner;
public class CP_2037B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x;
        int y;
        while(t-- > 0){
            int s = sc.nextInt();
            int arr[] = new int[s];
            for(int i = 0; i < s; i++){
                arr[i] = sc.nextInt();
            }
            for(int i = 0; i < s; i++){
                for(int j = i+1; j < s; j++){
                    if((arr[i] * arr[j]) == (s-2)){
                        System.out.println(arr[i] + " "+ arr[j]);
                    }
                }
            }
        }
    }
}