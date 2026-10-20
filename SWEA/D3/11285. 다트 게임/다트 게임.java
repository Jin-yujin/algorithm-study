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
			int score = 0;
			
			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int pita = x*x + y*y;
				
				if (pita<=20*20)
					score += 10;
				else if (pita>20*20 && pita<=40*40)
					score += 9;
				else if (pita>40*40 && pita<=60*60)
					score += 8;
				else if (pita>60*60 && pita<=80*80)
					score += 7;
				else if (pita>80*80 && pita<=100*100)
					score += 6;
				else if (pita>100*100 && pita<=120*120)
					score += 5;
				else if (pita>120*120 && pita<=140*140)
					score += 4;
				else if (pita>140*140 && pita<=160*160)
					score += 3;
				else if (pita>160*160 && pita<=180*180)
					score += 2;
				else if (pita>180*180 && pita<=200*200)
					score += 1;
				else
					score +=0;
			}
			System.out.println("#" + test_case + " " + score);
		}
	}
}