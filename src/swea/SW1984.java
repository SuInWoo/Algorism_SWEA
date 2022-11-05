package swea;

import java.util.Scanner;

public class SW1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr;

        for (int test = 1; test <= T; test++) {
            arr = new int[10];
            int max = 0;
            int min = 10000;
            int sum = 0;
            double rnt = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
                sum += arr[i];
            }

            rnt = (sum - max - min) / 8.0;
            System.out.printf("#%d %d\n", test, Math.round(rnt));

        }
    }
}
