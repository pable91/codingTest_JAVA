package com.personal.practice.inflearn.DFS_BFS_Basic;


// 경로 탐색 (인접 리스트)

import java.util.LinkedList;
import java.util.Scanner;

public class DFS4{

    static LinkedList<Integer>[] list;
    static int [] ch;
    static int n = 0;
    static int m = 0;
    static int cnt = 0;

    public void DFS(int L) {
        if (L == n) {
            cnt += 1;
            return;
        }

        for (int v : list[L]) {
            if (ch[v] == 0) {
                ch[v] = 1;
                DFS(v);
                ch[v] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        list = new LinkedList[n+1];
        ch = new int[n+1];
        int i = 0;
        for (i = 0; i <= n; ++i) {
            list[i] = new LinkedList<>();
        }

        for (i = 0; i < m; ++i) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            list[a].add(b);
        }

        DFS4 dfs = new DFS4();
        ch[1] = 1;
        dfs.DFS(1);

        System.out.println(cnt);
    }
}

//public class DFS4 {
//
//    static LinkedList<LinkedList<Integer>> list;
//    static int [] arr;
//    static int cnt = 0;
//    void DFS(int v, int target) {
//        if(v == target) {
//            cnt += 1;
//            return;
//        }
//
//        for(int a : list.get(v)) {
//              if(arr[a] == 0) {
//                  arr[a] = 1;
//                  DFS(a, target);
//                  arr[a] = 0;
//              }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        DFS4 bfs = new DFS4();
//
//        Scanner in=new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//
//        list = new LinkedList<>();
//        arr = new int[n+1];
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
//        arr[1] = 1;
//        bfs.DFS(1, 5);
//
//        System.out.println("cnt : " + cnt);
//    }
//}
