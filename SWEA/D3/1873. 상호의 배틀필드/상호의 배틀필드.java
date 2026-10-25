import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int r = 0; // 현재 위치
            int c = 0; // 현재 위치

            char[][] grid = new char[h][w];
            for (int i = 0; i < h; i++) {
                grid[i] = sc.next().toCharArray();

                if (r == 0 && c == 0) {
                    for (int j = 0; j < w; j++) {
                        if (grid[i][j] == '>' || grid[i][j] == '<' || grid[i][j] == '^' || grid[i][j] == 'v') {
                            r = i;
                            c = j;
                            break;
                        }
                    }
                }
            }

            int n = sc.nextInt();
            char[] arr = sc.next().toCharArray();

            for (int i = 0; i < n; i++) {
                if (arr[i] == 'S') {
                    int car_r = r;
                    int car_c = c;

                    if (grid[r][c]=='>') {
                        while (car_c < w-1) {
                            if (grid[r][car_c + 1] == '-') {
                                car_c++;
                            } else if (grid[r][car_c + 1] == '*') {
                                grid[r][++car_c]='.';
                                break;
                            } else if (grid[r][car_c + 1] == '.'){
                                car_c++;
                            } else break;
                        }
                    } else if (grid[r][c]=='<'){
                        while (car_c > 0) {
                            if (grid[r][car_c - 1] == '-') {
                                car_c--;
                            } else if (grid[r][car_c - 1] == '*') {
                                grid[r][--car_c]='.';
                                break;
                            } else if (grid[r][car_c - 1] == '.'){
                                car_c--;
                            } else break;
                        }
                    } else if (grid[r][c]=='^'){
                        while (car_r > 0) {
                            if (grid[car_r-1][c] == '-') {
                                car_r--;
                            } else if (grid[car_r-1][c] == '*') {
                                grid[--car_r][c]='.';
                                break;
                            } else if (grid[car_r-1][c] == '.'){
                                car_r--;
                            } else break;
                        }
                    } else if (grid[r][c]=='v'){
                        while (car_r < h-1) {
                            if (grid[car_r+1][c] == '-') {
                                car_r++;
                            } else if (grid[car_r+1][c] == '*') {
                                grid[++car_r][c]='.';
                                break;
                            } else if (grid[car_r+1][c] == '.'){
                                car_r++;
                            } else break;
                        }
                    }
                } else if (arr[i] == 'U'){
                    grid[r][c] = '^';
                    if (r > 0 && grid[r - 1][c] == '.') {
                        grid[r--][c] = '.';
                        grid[r][c] = '^';
                    }
                } else if (arr[i] == 'D') {
                    grid[r][c] = 'v';
                    if(r < h - 1 && grid[r+1][c]=='.') {
                        grid[r++][c] = '.';
                        grid[r][c] = 'v';
                    }
                } else if (arr[i] == 'L'){
                    grid[r][c] = '<';
                    if(c > 0 && grid[r][c-1]=='.') {
                        grid[r][c--] = '.';
                        grid[r][c] = '<';
                    }
                } else { // (arr[i] == 'R')
                    grid[r][c] = '>';
                    if(c < w - 1 && grid[r][c+1]=='.') {
                        grid[r][c++] = '.';
                        grid[r][c] = '>';
                    }
                }
            }

            System.out.print("#"+test_case+" ");
            for (int i = 0; i < h; i++) {
                System.out.println(grid[i]);
            }
        }
    }
}