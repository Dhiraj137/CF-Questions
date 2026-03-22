import java.util.Scanner;
public class C_Target_Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            char[][] arr = new char[10][10];
            for(int i = 0; i < arr.length; i++){
                String line = sc.next();
                for(int j = 0; j < arr[0].length; j++){
                    arr[i][j] = line.charAt(j);
                }
            }

            int count1 = 0;
            int count2 = 0; 
            int count3 = 0;
            int count4 = 0;
            int count5 = 0;

            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[0].length; j++){
                    if(arr[i][j] == 'X'){

                        if(i == 0 || i == 9 || j == 0 || j == 9){
                            count1++;
                        }else if(i == 1 || i == 8 || j == 1 || j == 8){
                            count2++;
                        }else if(i == 2 || i == 7 || j == 2 || j == 7){
                            count3++;
                        }else if(i == 3 || i == 6 || j == 3 || j == 6){
                            count4++;
                        }else{
                            count5++;
                        }
                    }
                }
            }
            int total = count1*1 + count2*2 + count3*3 + count4*4 + count5*5;
            System.out.println(total);
        }
    }
}