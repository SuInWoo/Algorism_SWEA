package swea;

import java.util.Scanner;

public class SW14555 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int tc=1; tc<=testCase; tc++) {
            String str = sc.next();
            str = str.replace("(|","a");
            str = str.replace("|)","a");
            str = str.replace("()", "a");
            char[] arr = str.toCharArray();
            int cnt = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]=='a') {
                    cnt++;
                }
            }
            System.out.printf("#%d %d\n",tc, cnt);
        }
    }
}
