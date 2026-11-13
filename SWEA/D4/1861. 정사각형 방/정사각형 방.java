import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    static int N, maxCount, minStart;
	static int[][] arr;

	// 상, 하, 좌, 우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			N = sc.nextInt();

			arr = new int[N][N];

			maxCount = 0;
			minStart = Integer.MAX_VALUE; // int 자료형이 표현할 수 있는 최댓값

			// 배열 입력
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 모든 방에서 DFS 시작
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					dfs(i, j, 1, arr[i][j]);
				}
			}

			System.out.println("#" + test_case + " " + minStart + " " + maxCount);
		}
	}

	static void dfs(int r, int c, int count, int start) {

		// 최대 이동 개수 갱신
		if (count > maxCount) {
			maxCount = count;
			minStart = start;
		}

		// 이동 개수가 같으면 시작 방 번호가 작은 것 선택
		else if (count == maxCount) {
			minStart = Math.min(minStart, start);
		}

		// 상하좌우 탐색
		for (int d = 0; d < 4; d++) {

			int nr = r + dr[d];
			int nc = c + dc[d];

			// 배열 범위 검사
			if (nr < 0 || nr >= N || nc < 0 || nc >= N) {
				continue;
			}

			// 현재 방보다 정확히 1 큰 방으로 이동
			if (arr[nr][nc] == arr[r][c] + 1) {
				dfs(nr, nc, count + 1, start);
			}
		}
	}
}