import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int happy = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 1; // 가로
            int cnt2 = 1; // 세로

            boolean rowHappy = (m == 1);
            boolean colHappy = (m == 1);

            for (int j = 0; j < n-1; j++) {

                if(grid[i][j]==grid[i][j+1]){  // 가로
                    cnt++;
                    if (cnt >= m) rowHappy = true;
                } else cnt = 1;

                if(grid[j][i]==grid[j+1][i]){  // 세로
                        cnt2++;
                        if (cnt2 >= m) colHappy = true;
                } else cnt2 = 1;

                if (rowHappy && colHappy) break;
            }
            if (rowHappy) happy++;
            if (colHappy) happy++;
        }

        System.out.println(happy);
    }
}