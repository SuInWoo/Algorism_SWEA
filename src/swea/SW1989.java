package swea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW1989 {
    public static boolean isPalindrome(String str) {
        int cnt = 0;
        int start = 0;
        int end = str.length()-1;
        while (cnt != str.length()/2){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
            cnt++;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();

            if (isPalindrome(str)){
                System.out.println("#" + i + " 1");
            } else System.out.println("#" + i + " 0");

        }
    }
}
