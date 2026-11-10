import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
		public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
			int t = sc.nextInt();
			int[][] map = new int[100][100];
			int x = 0;
			char d = 'H'; // 방향 -> 위: H, 왼쪽: L, 오른쪽: R

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					map[i][j] = sc.nextInt();

					if (i == 99 && map[i][j] == 2) {
						x = j;
					}
				}
			}
			int i = 99; // 현재 높이 (맨 아래에서부터 시작)
			// 현재 위치: map[i][x]

			while (true) {
				if (d == 'H') {
					if (x > 0 && map[i][x - 1] == 1) { // 왼쪽에 길이 있으면
						d = 'L';
						x--;
					}
					else if (x < 99 && map[i][x + 1] == 1) { // 오른쪽에 길이 있으면
						d = 'R';
						x++;
					} else { // 좌우에 길이 없으면 위로
						i--;
					}
				} else if (d == 'R') { // 오른쪽으로 이동중이었으면
					if (map[i - 1][x] == 1) { // 윗칸이 1이면
						d = 'H';
						i--;
					} else
						x++;
				} else if (d == 'L') { // 왼쪽으로 이동중이었으면
					if (map[i - 1][x] == 1) { // 윗칸이 1이면
						d = 'H';
						i--;
					} else
						x--;
				}

				if (i == 0) { // 맨 윗줄에 도착하면 반복문 종료
					break;
				}
			} // while

			System.out.println("#" + test_case + " " + x);
		} // tc
	} // main
}