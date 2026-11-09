import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] map = new int[N][N];
            int sum = 0;
            int mid = N / 2;

            for (int i = 0; i < N; i++) {
                String str = sc.next();

                for (int j = 0; j < N; j++) {
                    map[i][j] = str.charAt(j) - '0';
                }
            }

            for (int i = 0; i < N; i++) {
                sum += map[i][mid];
                int x = i;

                if (i > mid)
                    x = N - 1 - i;

                for (int j = 1; j <= x; j++) {
                    sum += map[i][mid - j];
                    sum += map[i][mid + j];
                }
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}