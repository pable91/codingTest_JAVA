package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BFS3Point {
    int x, y;

    BFS3Point(int x, int y) {
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

public class BFS3 {

    public static int n;
    public static int [][] arr;
    public static int answer = 0;

    public int [] dx = {1,1,1,0,-1,-1,-1,0};
    public int [] dy = {-1,0,1,1,1,0,-1,-1};

    void BFS(int x, int y) {
        Queue<BFS3Point> q = new LinkedList<>();
        q.offer(new BFS3Point(x,y));
        answer += 1;

        while(!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                BFS3Point p = q.poll();
                int xx = p.x;
                int yy = p.y;
                for (int j = 0; j < 8; ++j) {
                    int nx = xx + dx[j];
                    int ny = yy + dy[j];
                    if (ny > 0 && ny <= n && nx > 0 && nx <=n) {
                        if (arr[ny][nx] == 1){
                            arr[ny][nx] = 0;
                            q.offer(new BFS3Point(nx,ny));
                        }
                    }
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

        BFS3 bfs3 = new BFS3();
        for (i = 1; i <= n; ++i) {
            for (j = 1; j <= n; ++j) {
                if (arr[i][j] == 1) {
                    arr[i][j] = 0;
                    bfs3.BFS(j, i);
                }
            }
        }

        System.out.println(answer);
    }
}