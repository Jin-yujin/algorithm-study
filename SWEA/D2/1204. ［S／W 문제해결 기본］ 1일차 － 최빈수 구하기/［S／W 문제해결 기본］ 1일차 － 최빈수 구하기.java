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
            int n = sc.nextInt();
			int[] score = new int[1000];

			for (int i = 0; i < 1000; i++) {
				int num = sc.nextInt();
				score[num]++;
			}

			int many = 0;
			int max = 0;

			for (int i = 0; i < 1000; i++) {
				if (score[i] > many) {
					many = score[i];
					max = i;
				} else if (score[i] == many)
					max = i;
			}

			System.out.println("#" + test_case + " " + max);
		}
	}
}