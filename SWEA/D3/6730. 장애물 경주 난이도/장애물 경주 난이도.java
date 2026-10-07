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
			int N = sc.nextInt();
			int[] level = new int[N];
			int up = 0;
			int down = 0;
						
			for (int i = 0; i < N; i++) {
				level[i] = sc.nextInt();
				
				if(i != 0) {
					if(level[i-1]<level[i]) {
						up = Math.max(up, level[i]-level[i-1]);
					}
					else {
						down = Math.max(down, level[i-1]-level[i]);
					}
				}
			}
			System.out.println("#" + test_case + " " + up + " " + down);
		}
	}
}