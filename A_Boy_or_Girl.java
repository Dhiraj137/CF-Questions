import java.util.Arrays;
import java.util.Scanner;

public class A_Boy_or_Girl{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] arr = new boolean[26];
        Arrays.fill(arr,false);

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(arr[ch-'a'] == false){
                count++;
                arr[ch-'a'] = true;
            }
        }

        if(count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}