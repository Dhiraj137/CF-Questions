import java.util.Scanner;
public class A_Letter_Home{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
            int min = arr[0];
            int max = arr[n-1];
            if(n == 1 && s == arr[0]){
                System.out.println(0);
            }else if(min == max){
                System.out.println(Math.abs(max-s));
            }else if(min > s && max > s){
                System.out.println(max-s);
            }else if(min < s && max < s) {
                System.out.println(Math.abs(s-min));
            }else{ 
                if(max-s < s-min){
                    System.out.println((max-s)*2 + (s-min));
                }else{
                    System.out.println((s-min)*2 + (max-s));
                }
                
            } 
        }
    }
}