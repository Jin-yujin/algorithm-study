import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int N, Limit, max_s;
	static int[] score, kal;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			Limit = sc.nextInt();
			max_s = 0;
			score = new int[N];
			kal = new int[N];

			for (int i = 0; i < N; i++) {
				score[i] = sc.nextInt();
				kal[i] = sc.nextInt();
			}

			dfs(0, 0, 0);

			System.out.println("#" + test_case + " " + max_s);
		}
	}

	static void dfs(int index, int sum_s, int sum_k) {
		if (sum_k > Limit)
			return;

		if (index == N) {
			max_s = Math.max(max_s, sum_s);
			return;
		}

		// 이 재료를 선택했을 때
		dfs(index + 1, sum_s + score[index], sum_k + kal[index]);

		// 이 재료를 선택하지 않았을 때
		dfs(index + 1, sum_s, sum_k);
	}
}