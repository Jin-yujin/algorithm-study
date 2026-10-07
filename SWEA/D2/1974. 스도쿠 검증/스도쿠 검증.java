import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for (int test_case = 1; test_case <= T; test_case++) {
            int[][] sdoku = new int[9][9];
            int result = 1;

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sdoku[i][j] = sc.nextInt();
                }
            } // 스도쿠 입력

            // 가로 줄 확인
            for (int i = 0; i < 9; i++) {
                int[] num = new int[9];

                for (int j = 0; j < 9; j++) {
                    num[sdoku[i][j] - 1]++;
                }

                for (int j = 0; j < 9; j++) {
                    if (num[j] != 1) {
                        result = 0;
                        break;
                    }
                }
            }

            // 세로 줄 확인
            if (result == 1) {
                for (int i = 0; i < 9; i++) {
                    int[] num = new int[9];

                    for (int j = 0; j < 9; j++) {
                        num[sdoku[j][i] - 1]++;
                    }

                    for (int j = 0; j < 9; j++) {
                        if (num[j] != 1) {
                            result = 0;
                            break;
                        }
                    }
                }
            }

            // 3x3 격자 확인
            if (result == 1) {
                for (int i = 0; i < 9; i += 3) {

                    for (int j = 0; j < 9; j += 3) {

                        int[] num = new int[9];

                        for (int x = 0; x < 3; x++) {
                            for (int y = 0; y < 3; y++) {
                                num[sdoku[i + x][j + y] - 1]++;
                            }
                        }

                        for (int k = 0; k < 9; k++) {
                            if (num[k] != 1) {
                                result = 0;
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("#" + test_case + " " + result);
        } // test_case for문
    }
}