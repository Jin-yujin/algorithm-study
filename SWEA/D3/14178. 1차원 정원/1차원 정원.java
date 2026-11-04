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
			int D = sc.nextInt();
			
			int result = (N+2*D)/(2*D+1);
			
			System.out.println("#" + test_case + " " + result);
		}
	}
}