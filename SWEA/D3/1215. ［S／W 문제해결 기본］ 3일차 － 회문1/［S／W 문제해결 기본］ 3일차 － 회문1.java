import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			char[][] str = new char[8][8];
			int sum = 0;

			for (int i = 0; i < 8; i++) {
				str[i] = sc.next().toCharArray();
			}

			// 가로
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					int count = 0;
					for (int k = 0; k < N / 2; k++) {
						if (str[i][j + k] == str[i][N - 1 + j - k]) {
							count++;
						}
					}
					if (count == N / 2) {
						sum++;
					}
				}
			}

			// 세로
			for (int i = 0; i < str.length; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					int count = 0;
					for (int k = 0; k < N / 2; k++) {
						if (str[j + k][i] == str[N - 1 + j - k][i]) {
							count++;
						}
					}
					if (count == N / 2) {
						sum++;
					}
				}
			}

			System.out.println("#" + test_case + " " + sum);
		}
	}
}