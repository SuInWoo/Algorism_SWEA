package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW14692 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        for (int i = 1; i <= TC; i++) {
            String str = "Bob";
            if (Integer.parseInt(br.readLine()) % 2 == 0)
                str = "Alice";

            System.out.printf("#%d %s\n", i, str);
        }
    }
}
