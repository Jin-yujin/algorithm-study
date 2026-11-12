import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int N, K, count;
	static int[] arr;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();
			arr = new int[N];
			count = 0;

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			dfs(0, 0); // 0번 인덱스부터 sum=0: 현재까지 선택한 숫자의 합

			System.out.println("#" + test_case + " " + count);
		}
	}

	static void dfs(int idx, int sum) {
		// 종료 조건
		if (idx == N) {
			if (sum == K) {
				count++;
			}
			return;
		}

		// 현재 숫자를 선택하는 경우
		dfs(idx + 1, sum + arr[idx]);

		// 현재 숫자를 선택하지 않는 경우
		dfs(idx + 1, sum);
	}
}