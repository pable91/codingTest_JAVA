package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.Scanner;

// 섬나라 아일랜드

public class DFS7 {

    public static int n;
    public static int [][] arr;
    public static int answer = 0;

    public int [] dx = {1,1,1,0,-1,-1,-1,0};
    public int [] dy = {-1,0,1,1,1,0,-1,-1};

    void DFS(int x, int y) {

        for (int i = 0; i < 8; ++i) {
            int ny = y+dy[i];
            int nx = x+dx[i];
            if (ny > 0 && ny <= n && nx > 0 && nx <=n) {
                if (arr[ny][nx] == 1) {
                    arr[ny][nx] = 0;
                    DFS(nx,ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        arr = new int[n+1][n+1];

        int i,j;
        for (i = 1; i <= n; ++i) {
            for (j = 1; j <= n; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }

        DFS7 dfs7 = new DFS7();
        for (i = 1; i <= n; ++i) {
            for (j = 1; j <= n; ++j) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    answer += 1;
                    dfs7.DFS(j, i);
                }
            }
        }

        System.out.println(answer);
    }
}
