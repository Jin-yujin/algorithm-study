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
			int P = sc.nextInt(); // A사 1리터당 요금
			int Q = sc.nextInt(); // B사 기본 요금(R리터 이하일 때)
			int R = sc.nextInt(); // B사 기본 요금 내는 기준의 양
			int S = sc.nextInt(); // B사 1리터당 요금
			int W = sc.nextInt(); // 한 달간 사용하는 수도의 양

			int sum = 0;

			if (R >= W)
				sum = P * W < Q ? P * W : Q;

			if (R < W) {
				sum = P * W < Q + (W - R) * S ? P * W : Q + (W - R) * S;
			}

			System.out.println("#" + test_case + " " + sum);
		}
	}
}
