import java.util.*;

public class A_Forked{

    public static void solve(Scanner sc) {
        int a = sc.nextInt(), b = sc.nextInt();
        int kx = sc.nextInt(), ky = sc.nextInt();
        int qx = sc.nextInt(), qy = sc.nextInt();

        List<int[]> king = new ArrayList<>();
        List<int[]> queen = new ArrayList<>();

        king.add(new int[]{kx + b, ky + a});
        king.add(new int[]{kx - b, ky + a});
        king.add(new int[]{kx + b, ky - a});
        king.add(new int[]{kx - b, ky - a});
        king.add(new int[]{kx + a, ky + b});
        king.add(new int[]{kx - a, ky + b});
        king.add(new int[]{kx + a, ky - b});
        king.add(new int[]{kx - a, ky - b});

        queen.add(new int[]{qx + b, qy + a});
        queen.add(new int[]{qx - b, qy + a});
        queen.add(new int[]{qx + b, qy - a});
        queen.add(new int[]{qx - b, qy - a});
        queen.add(new int[]{qx + a, qy + b});
        queen.add(new int[]{qx - a, qy + b});
        queen.add(new int[]{qx + a, qy - b});
        queen.add(new int[]{qx - a, qy - b});

        Set<String> st = new HashSet<>();
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (king.get(i)[0] == queen.get(j)[0] && king.get(i)[1] == queen.get(j)[1]) {
                    st.add(king.get(i)[0] + "," + king.get(i)[1]);
                }
            }
        }
        System.out.println(st.size());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            solve(sc);
        }
    }
}
