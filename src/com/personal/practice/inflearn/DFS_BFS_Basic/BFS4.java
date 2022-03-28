package com.personal.practice.inflearn.DFS_BFS_Basic;

// 그래프 최단거리(BFS)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS4 {

    static int N, M;
    static LinkedList<LinkedList<Integer>> list;
    static int ch[];
    static int cnt;
    public static void BFS(int L) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(L);

        while(!q.isEmpty()) {
            int size = q.size();
            cnt += 1;
            for (int i = 0; i < size; ++i) {
                int n = q.poll();
                for (int v : list.get(n)) {
                    if (ch[v] == 0) {
                        ch[v] = cnt;
                        q.offer(v);
                        //System.out.println(v + " : " + cnt);
                    }
                }
            }
        }

        for (int j = 2; j <= N; ++j) {
            System.out.println(j + " " + ch[j]);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        list = new LinkedList<>();

        int i = 0;
        for (i = 0; i <= N; ++i) {
            list.add(new LinkedList<>());
        }
        ch = new int[N + 1];

        for (i = 0; i < M; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            list.get(a).add(b);
        }

        ch[1] += 1;
        BFS(1);

    }
}



//public class BFS4 {
//
//    static LinkedList<LinkedList<Integer>> list;
//    static int [] arr;
//    static int cnt = 0;
//
//    void BFS(int v) {
//        Queue<Integer> q = new LinkedList<>();
//        q.offer(v);
//        cnt = 1;
//
//        while (!q.isEmpty()) {
//            int n = q.size();
//            for (int i = 0; i < n; ++i) {
//                int v1 = q.poll();
//                for (int v2 : list.get(v1)) {
//                    // 0이면 한번도 가본적이 없다는 뜻임.
//                    if (arr[v2] == 0) {
//                        q.offer(v2);
//                        arr[v2] = cnt;
//                    }
//                }
//            }
//            cnt += 1;
//        }
//
//    }
//    public static void main(String[] args) {
//        BFS4 bfs = new BFS4();
//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        list = new LinkedList<>();
//        arr = new int[n + 1];
//
//        for (int i = 0; i <= n; ++i) {
//            list.add(new LinkedList<>());
//        }
//
//        for (int j = 0; j < m; ++j) {
//            int v1 = in.nextInt();
//            int v2 = in.nextInt();
//
//            list.get(v1).add(v2);
//        }
//
//        //arr[1] = 1;
//        bfs.BFS(1);
//
//        for (int i = 2; i <= n; ++i) {
//            System.out.println(i + " : "  + arr[i]);
//        }
//    }
//}
