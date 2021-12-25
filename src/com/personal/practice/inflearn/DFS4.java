package com.personal.practice.inflearn;


// 경로 탐색 (인접 리스트)

import java.util.LinkedList;
import java.util.Scanner;

public class DFS4 {

    static LinkedList<LinkedList<Integer>> list;
    static int [] arr;
    static int cnt = 0;
    void DFS(int v, int target) {
        if(v == target) {
            cnt += 1;
            return;
        }

        for(int a : list.get(v)) {
              if(arr[a] == 0) {
                  arr[a] = 1;
                  DFS(a, target);
                  arr[a] = 0;
              }
        }
    }


    public static void main(String[] args) {
        DFS4 bfs = new DFS4();

        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        list = new LinkedList<>();
        arr = new int[n+1];

        for (int i = 0; i <= n; ++i) {
            list.add(new LinkedList<>());
        }

        for (int j = 0; j < m; ++j) {
            int v1 = in.nextInt();
            int v2 = in.nextInt();

            list.get(v1).add(v2);
        }

        arr[1] = 1;
        bfs.DFS(1, 5);

        System.out.println("cnt : " + cnt);
    }
}
