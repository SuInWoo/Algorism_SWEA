package swea;

import java.util.Scanner;

public class SW1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            boolean flag = true;
            int rnt = 0;

            for (int j = 1; j <= N; j++) {
                if (flag) {
                    rnt += j;
                } else {
                    rnt -= j;
                }
                flag = !flag;
            }

            System.out.printf("#%d %d\n", i, rnt);
        }
    }
}
