package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 미로의 최단거리 통로

class Object {
    int x;
    int y;
    Object(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class BFS1 {

    static int [][] board;
    static int answer = 1;
    static int [] dy = {0,1,0,-1};
    static int [] dx = {1,0,-1,0};
    static Queue<Object> q = new LinkedList<>();

    public static void BFS(int x, int y) {

        while(!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; ++i) {
                Object obj = q.poll();
                for (int j = 0; j < 4; ++j) {
                    int xx = obj.getX()+dx[j];
                    int yy = obj.getY()+dy[j];

                    if(xx == 7 && yy == 7) {
                        return;
                    }

                    if (xx > 0 && xx < 8 && yy > 0 && yy < 8) {
                        if (board[yy][xx] == 0){
                            board[yy][xx] = 1;
                            q.offer(new Object(xx,yy));
                        }
                    }
                }
            }
            answer += 1;
        }

        answer = -1;
        return;
    }

    public static void main(String[] args) {
        BFS1 bfs1 = new BFS1();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                board[i][j] = kb.nextInt();
            }
        }

        board[1][1] = 1;
        q.offer(new Object(1,1));
        bfs1.BFS(1,1);
        System.out.println(answer);
    }
}
