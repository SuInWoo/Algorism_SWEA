package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW15230 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        char[] alpha = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int n = Integer.parseInt(br.readLine());
        for (int test = 1; test <= n; test++) {

            int cnt = 0;
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == alpha[i]) {
                    cnt++;
                } else
                    break;
            }
            System.out.printf("#%d %d\n", test, cnt);
        }
    }
}
