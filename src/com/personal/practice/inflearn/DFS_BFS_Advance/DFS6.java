package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.Scanner;

// 미로 탐색
public class DFS6 {

    static int [][] board;
    static int answer = 0;
    static int [] dy = {0,1,0,-1};
    static int [] dx = {1,0,-1,0};
    public static void DFS(int x, int y) {
        if (x == 7 && y == 7)
            answer += 1;

        for (int i = 0; i < 4; ++i) {
            int xx = x+dx[i];
            int yy = y+dy[i];
            if (xx > 0 && xx < 8 && yy > 0 && yy < 8) {
                if (board[yy][xx] == 0){
                    board[yy][xx] = 1;
                    DFS(xx,yy);
                    board[yy][xx] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS6 dfs6 = new DFS6();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        board[1][1] = 1;
        dfs6.DFS(1,1);
        System.out.println(answer);
    }
}
