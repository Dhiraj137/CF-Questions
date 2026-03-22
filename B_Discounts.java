import java.io.*;
import java.util.*;

public class B_Discounts {
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do { c = readByte(); } while (c <= ' ');
            if (c == '-') { sign = -1; c = readByte(); }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }

        long nextLong() throws IOException {
            int c, sign = 1;
            long val = 0;
            do { c = readByte(); } while (c <= ' ');
            if (c == '-') { sign = -1; c = readByte(); }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();

            long[] a = new long[n];
            int[] b = new int[k];

            for (int i = 0; i < n; i++) a[i] = fs.nextLong();
            for (int i = 0; i < k; i++) b[i] = fs.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);

            long ans = 0;
            for (long val : a) ans += val;

            int id = n;
            for (int i = 0; i < k; i++) {
                id -= b[i];
                if (id < 0) break;   // ✅ prevent runtime error
                ans -= a[id];
            }

            out.append(ans).append('\n');
        }

        System.out.print(out);
    }
}
