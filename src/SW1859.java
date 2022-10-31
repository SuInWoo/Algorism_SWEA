import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SW1859 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("res/in1859/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long rnt = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = n-1; i >= 0; i--) {
                if (arr[i] > max)
                    max = arr[i];
                rnt += max - arr[i];
            }
            System.out.printf("#%d %d\n", test_case, rnt);

        }
        sc.close();
    }
}
