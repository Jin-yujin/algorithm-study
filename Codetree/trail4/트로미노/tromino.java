import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        int max = 0;

        // ㅣ모양 3칸 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m-2; j++) {  // 가로 검사
                max = Math.max(max, grid[i][j]+grid[i][j+1]+grid[i][j+2]);
            }

            if(i<n-2){
                for (int j = 0; j < m; j++) {  // 세로 검사
                    max = Math.max(max, grid[i][j]+grid[i+1][j]+grid[i+2][j]);
                }
            }
        }

        // ㄱ모양 3칸
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < m-1; j++) {  
                max = Math.max(max, grid[i][j]+grid[i+1][j]+grid[i+1][j+1]); // ㄴ 검사
                max = Math.max(max, grid[i][j]+grid[i][j+1]+grid[i+1][j+1]); // ㄱ 검사
                max = Math.max(max, grid[i][j]+grid[i+1][j]+grid[i][j+1]); // ㄱ 좌우 반전 검사
                max = Math.max(max, grid[i+1][j]+grid[i][j+1]+grid[i+1][j+1]); // ㄴ 좌우 반전 검사
            }
        }

        System.out.println(max);
    }
}