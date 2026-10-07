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
			int count = 0;
			int sum = 0;
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i]=sc.nextInt();
				sum+=arr[i];
			}
			
			for (int i = 0; i < N; i++) {
				if (arr[i] <= sum/N)
					count ++;
			}
			
			System.out.println("#" + test_case + " " + count);
		}
	}
}