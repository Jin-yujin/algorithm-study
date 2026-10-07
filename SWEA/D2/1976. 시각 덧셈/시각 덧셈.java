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
			int[] time = new int[4];
			int s = 0;
			int m = 0;

			for (int i = 0; i < 4; i++) {
				time[i] = sc.nextInt();
			}

			s = time[0] + time[2];
			m = time[1] + time[3];
			
			if (time[0]+time[2]>=12)
				s-=12;

			if (time[1] + time[3] >= 60) {
				s++;
				m -= 60;
			}

			System.out.println("#" + test_case + " " + s + " " + m);
		}
	}
}