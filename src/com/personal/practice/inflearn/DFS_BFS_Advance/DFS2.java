package com.personal.practice.inflearn.DFS_BFS_Advance;

// 바둑이 승차

import java.util.Arrays;
import java.util.Scanner;

public class DFS2 {
    static int C;
    static int N;
    static int [] arr;
    static int max = 0;

    public static int DFS(int L, int sum) {
        if (sum > C) {
            return sum-arr[L-1];
        }

        if (L == N) {
            return sum;
        }

        return Math.max(DFS(L+1, sum + arr[L]), DFS(L+1, sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; ++i) {
            int n = sc.nextInt();
            arr[i] = n;
        }

        System.out.println(DFS(0, 0));
    }
}

//public class DFS2 {
//
//    static int c;
//    static int n;
//    static int [] arr;
//    static int sum = 0;
//
//    int DFS(int sum, int a) {
//        if (sum > c) {
//            sum -= arr[a-1];
//            return sum;
//        }
//
//        if (a == n){
//            return sum;
//        }
//
//        return Math.max(DFS( sum + arr[a], a + 1), DFS(sum,a + 1));
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        c = in.nextInt();
//        n = in.nextInt();
//
//        arr = new int[n];
//
//        for (int i = 0; i < n; ++i) {
//            arr[i] = in.nextInt();
//        }
//
//        DFS2 dfs6 = new DFS2();
//        System.out.println(dfs6.DFS(sum,0));
//    }
//}
