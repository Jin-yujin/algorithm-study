import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.FileInputStream;

class Solution
{
		public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int test_case = 1; test_case <= 10; test_case++) {
			int t = Integer.parseInt(br.readLine());
			int[][] map = new int[100][100];

			int x = 0;

			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				for (int j = 0; j < 100; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());

					if (i == 99 && map[i][j] == 2) {
						x = j;
					}
				}
			}

			int i = 99;

			while (i > 0) {

				// 왼쪽에 길이 있으면 끝까지 이동
				if (x > 0 && map[i][x - 1] == 1) {
					while (x > 0 && map[i][x - 1] == 1) {
						x--;
					}
				}

				// 오른쪽에 길이 있으면 끝까지 이동
				else if (x < 99 && map[i][x + 1] == 1) {
					while (x < 99 && map[i][x + 1] == 1) {
						x++;
					}
				}

				// 위로 한 칸 이동
				i--;
			}

			System.out.println("#" + t + " " + x);
		}
	}
}