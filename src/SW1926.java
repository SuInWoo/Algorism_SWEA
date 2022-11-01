import java.util.Scanner;

public class SW1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String s = Integer.toString(i);
            String rnt = "";
            boolean check = false;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '3' || c == '6' || c =='9') {
                    rnt += '-';
                    check = true;
                }
            }
            if (!check)
                rnt = s;
            System.out.printf("%s ", rnt);
        }
    }
}
