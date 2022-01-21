package com.personal.practice.inflearn.DFS_BFS_Advance;

// 피자 배달 거리

import java.util.ArrayList;
import java.util.Scanner;

class DFS8Point {
    int x;
    int y;

    DFS8Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class DFS8 {

    static int n;
    static int m;
    static int[] combi;
    static int answer = Integer.MAX_VALUE;
    static int len;
    static ArrayList<DFS8Point> pz = new ArrayList<>();
    static ArrayList<DFS8Point> hs = new ArrayList<>();

    public void DFS(int L, int s) {
        if(L==m) {
            int sum = 0;
            for(DFS8Point h : hs) {
                int dis = Integer.MAX_VALUE;
                for(int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
            return;
        }

        for(int i = s; i < len; i++) {
            combi[L] = i;
            DFS(L+1, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        int i,j;
        for (i = 1; i <= n; ++i) {
            for(j = 1; j <= n; ++j) {
                int tmp = scanner.nextInt();
                if (tmp == 1) hs.add(new DFS8Point(i,j));
                else if(tmp == 2) pz.add(new DFS8Point(i,j));
            }
        }

        len = pz.size();
        combi = new int[m];
        DFS8 dfs8 = new DFS8();
        dfs8.DFS(0,0);

        System.out.println(answer);
    }
}

