package com.personal.practice.inflearn.DFS_BFS_Advance;

// 순열 구하기

import java.util.Scanner;

public class DFS10 {

    static int N;
    static int M;
    static int [] arr;
    static int [] ch;
    static int [] answer;
    public static void DFS(int L) {
        if (L == M) {

            for (int elem : answer) {
                System.out.print(elem + " ");
            }
            System.out.println();

            return;
        }

        for(int i = 0; i < N; ++i) {
            if (ch[i] == 0) {
                ch[i] = 1;
                answer[L] = arr[i];
                DFS(L + 1);
                ch[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new int[N];
        ch = new int[N];
        answer = new int[M];

        for(int i = 0; i < N; ++i) {
            arr[i] = scanner.nextInt();
        }

        DFS(0);
    }
}















//public class DFS10 {
//
//    static int n;
//    static int m;
//    static int [] arr;
//    static int [] check;
//    static int [] answer;
//
//    public void DFS(int L) {
//        if(L == m) {
//            for (int j = 0; j < m; ++j) {
//                System.out.print(answer[j] + " ");
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = 0; i < n; ++i) {
//            if(check[i] == 0) {
//                check[i] = 1;
//                answer[L] = arr[i];
//                DFS(L+1);
//                check[i] = 0;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        m = scanner.nextInt();
//
//        arr = new int[n];
//        check = new int[n];
//        answer = new int[m];
//
//        for (int i = 0; i < n; ++i) {
//            arr[i] = scanner.nextInt();
//        }
//
//        DFS10 dfs10 = new DFS10();
//        dfs10.DFS(0);
//    }
//}
