package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.Scanner;

// 중복 순열 구하기

public class DFS9 {
    static int N;
    static int M;
    static int [] arr;
    public static void DFS(int L) {
        if(L == M) {

            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; ++i) {
            arr[L] = i;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new int[M];
        DFS(0);
    }
}



//public class DFS9 {
//
//    static int n;
//    static int m;
//    static int [] arr;
//    public void DFS(int L) {
//        if(L == m) {
//            for (int i = 0; i < 2; ++i) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int j = 1; j <= n; ++j) {
//            arr[L] = j;
//            DFS(L + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        m = scanner.nextInt();
//
//        arr = new int[m];
//
//        DFS9 dfs9 = new DFS9();
//        dfs9.DFS(0);
//    }
//}
