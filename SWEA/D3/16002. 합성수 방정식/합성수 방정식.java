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

            int x, y;

            if (N % 2 == 0) {
                x = N + 4;
                y = 4;
            } else {
                x = N + 9;
                y = 9;
            }

            System.out.println("#" + test_case + " " + x + " " + y);
        }
    }
}