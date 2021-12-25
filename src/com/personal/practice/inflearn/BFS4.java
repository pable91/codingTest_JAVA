package com.personal.practice.inflearn;

// 그래프 최단거리(BFS)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS4 {

    static LinkedList<LinkedList<Integer>> list;
    static int [] arr;
    static int cnt = 0;

    void BFS(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        cnt = 1;

        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; ++i) {
                int v1 = q.poll();
                for (int v2 : list.get(v1)) {
                    // 0이면 한번도 가본적이 없다는 뜻임.
                    if (arr[v2] == 0) {
                        q.offer(v2);
                        arr[v2] = cnt;
                    }
                }
            }
            cnt += 1;
        }

    }
    public static void main(String[] args) {
        BFS4 bfs = new BFS4();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        list = new LinkedList<>();
        arr = new int[n + 1];

        for (int i = 0; i <= n; ++i) {
            list.add(new LinkedList<>());
        }

        for (int j = 0; j < m; ++j) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();

            list.get(v1).add(v2);
        }

        //arr[1] = 1;
        bfs.BFS(1);

        for (int i = 2; i <= n; ++i) {
            System.out.println(i + " : "  + arr[i]);
        }
    }
}
