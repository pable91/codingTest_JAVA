package com.personal.practice.inflearn.DFS_BFS_Advance;

// 토마토

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS2 {
    static int [][] arr;

    static int m;
    static int n;
    int [] dy = {0,1,0,-1};
    int [] dx = {1,0,-1,0};
    static Queue<Object> q = new LinkedList<>();
    static int answer = -1;
    public void BFS() {

        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; ++i) {
                Object obj = q.poll();
                int x = obj.getX();
                int y = obj.getY();
                for (int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if ((nx >= 1) && (nx <= m)
                    && (ny >= 1) && (ny <= n) ) {
                        if (arr[ny][nx] == 0) {
                            arr[ny][nx] = 1;
                            q.offer(new Object(nx,ny));
                        }
                    }
                }
            }
            answer += 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();

        arr = new int[n+1][m+1];
        int i,j;
        for(i = 1; i <= n; ++i) {
            for (j = 1; j <= m; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }

        BFS2 bfs2 = new BFS2();
        for(i = 1; i <= n; ++i) {
            for (j = 1; j <= m; ++j) {
                if (arr[i][j] == 1){
                    q.offer(new Object(j,i));
                }
            }
        }

        if (q.isEmpty())
            answer = 0;
        else
            bfs2.BFS();

        for (i = 1; i <= n; ++i) {
            for (j = 1; j <= m; ++j) {
                if (arr[i][j] == 0) {
                    answer = -1;
                }
            }
        }

        System.out.println(answer);
    }
}
