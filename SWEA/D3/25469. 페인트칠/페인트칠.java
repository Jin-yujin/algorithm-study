import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			
			char[][] arr = new char[H][W];
			int count = 0;
			
			boolean[] bool_r = new boolean[H];
			boolean[] bool_c = new boolean[W];
			boolean hasWhite = false;

			for (int i = 0; i < H; i++) {
				String line = sc.next();
				
				for (int j = 0; j < W; j++) {
					arr[i][j] = line.charAt(j);

					if (arr[i][j] == '.') {
						bool_r[i] = true;
						hasWhite = true;
					}
				}
				if (!bool_r[i]) {
					for (int j = 0; j < W; j++) {
						arr[i][j] = 'ㅁ';
					}
					count++;
				}
			}
			
			// 모든 칸이 검은색인 경우
            if (!hasWhite) {
                System.out.println(Math.min(H, W));
                continue;
            }

			for (int i = 0; i < W; i++) {
				for (int j = 0; j < H; j++) {
					
					if (arr[j][i] == '.') {
						bool_c[i] = true;
						break;
					}
				}
			}

			for (int i = 0; i < W; i++) {
				
				if (!bool_c[i]) {
					
					for (int j = 0; j < H; j++) {
						arr[j][i] = 'ㅁ';
					}
					count++;
				}
			}
			System.out.println(count);
		}
	}
}