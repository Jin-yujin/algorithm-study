import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for (int test_case = 1; test_case <= 10; test_case++) {
            int N = sc.nextInt(); // 덤프 횟수
            int[] box = new int[100];

            for (int i = 0; i < 100; i++) {
                box[i] = sc.nextInt();
            }

            for (int i = 0; i < N; i++) {
                int max = box[0];
                int min = box[0];
                int max_i = 0; // max 인덱스
                int min_i = 0; // min 인덱스

                for (int j = 0; j < 100; j++) {
                    if (max < box[j]) {
                        max = box[j];
                        max_i = j;
                    }
                    if (min > box[j]) {
                        min = box[j];
                        min_i = j;
                    }
                }
                box[max_i] -= 1;
                box[min_i] += 1;
            }

            int max = 0;
            int min = box[0];
            for (int i = 0; i < 100; i++) {
                max = Math.max(max, box[i]);
                min = Math.min(min, box[i]);
            }

            System.out.println("#" + test_case + " " + (max - min));
        }
    }
}