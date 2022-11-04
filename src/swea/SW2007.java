package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            for (int j = 1; j <= 10; j++) {
                if (str.substring(0, j).equals(str.substring(j, j+j))) {
                    System.out.printf("#%d %d\n", i, j);
                    break;
                }
            }
        }
    }
}
