import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine().trim();
            int answer = 0;

            for (int len = 1; len <= 10; len++) {
                String pattern = str.substring(0, len);
                String next = str.substring(len, len * 2);

                if (pattern.equals(next)) {
                    answer = len;
                    break; 
                }
            }

            System.out.println("#" + tc + " " + answer);
        }
    }
}