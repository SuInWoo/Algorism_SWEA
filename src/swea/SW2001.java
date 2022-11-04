package swea;

import java.util.Scanner;

public class SW2001 {
    static int[][] arr;
    public static int nFlapper(int m, int row, int column) {

        int rnt = 0;
        for (int i = row; i < row+m; i++) {
            for (int j = column; j < column+m; j++) {
                rnt += arr[i][j];
            }
        }

        return rnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test= 1; test <= T; test++) {
            int max = 0;
            int N = sc.nextInt();
            int M = sc.nextInt();
            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    int a = nFlapper(M, i, j);
                    if (a > max)
                        max = a;
                }
            }

            System.out.println("#" + test + " " + max);
        }
    }
}
