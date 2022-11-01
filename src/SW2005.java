import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW2005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] triangle = new int[N][N];

            for (int j = 0; j < N; j++) {
                for (int k = 0; k <= j; k++) {
                    if (k == 0) {   //처음
                        triangle[j][k] = 1;
                    } else if (j == k) {    //마지막
                        triangle[j][k] = 1;
                    } else {
                        triangle[j][k] = triangle[j-1][k-1] + triangle[j-1][k];
                    }
                }
            }

            System.out.printf("#%d\n", i);

            for (int j = 0; j < N; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.printf("%d ", triangle[j][k]);
                }
                System.out.println();
            }
        }

    }
}
