package com.personal.practice.inflearn.DFS_BFS_Advance;

// 바둑이 승차

import java.util.Scanner;

public class DFS2 {

    static int c;
    static int n;
    static int [] arr;
    static int sum = 0;

    int DFS(int sum, int a) {
        if (sum > c) {
            sum -= arr[a-1];
            return sum;
        }

        if (a == n){
            return sum;
        }

        return Math.max(DFS( sum + arr[a], a + 1), DFS(sum,a + 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }

        DFS2 dfs6 = new DFS2();
        System.out.println(dfs6.DFS(sum,0));
    }
}
