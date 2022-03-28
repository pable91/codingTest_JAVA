package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.Scanner;

// 수열 추측하기

public class DFS5 {
    static int N;
    static int F;

    // 콤비네이션 값
    static int [] pm;

    // 순열 값
    static int [] arr;

    // 순열의 중복체크를 위한 체크 배열
    static int [] ch;

    static int [][] dy = new int[35][35];

    static boolean flag = false;

    public static int combination(int n, int r) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r]=combination(n-1, r-1) + combination(n-1,r);
    }

    private static void DFS(int L, int sum) {
        if(flag == true)
            return;

        if(L == N) {
            if(sum == F) {
                flag = true;
                for (int elem : arr) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            return;
        }

        for (int i = 1; i <= N; ++i) {
            if(ch[i] == 0) {
                ch[i] = 1;
                arr[L] = i;
                DFS(L+1, sum + (pm[L] * arr[L]));
                ch[i] = 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        N = kb.nextInt();
        F = kb.nextInt();

        pm = new int[N];

        arr = new int[N];

        ch = new int[N+1];

        for (int i = 0; i < N; ++i) {
            pm[i] = combination(N-1, i);
        }

        DFS(0, 0);
    }
}





















//public class DFS5 {
//
//    static int[] b,p,ch;
//    static int n,f;
//    int[][] dy = new int[35][35];
//    boolean flag = false;
//    public int combi(int n, int r) {
//        if(dy[n][r] > 0) return dy[n][r];
//        if(n==r || r==0) return 1;
//        else return dy[n][r]=combi(n-1, r-1) + combi(n-1,r);
//    }
//
//
//    public void DFS(int L, int sum) {
//        if (flag == true) {
//            return;
//        }
//
//        if (L == n) {
//            if (sum == f) {
//                for (int i = 0; i < n; ++i) {
//                    System.out.print(p[i] + " ");
//                }
//                flag = true;
//            }
//        }
//
//        for (int i = 1; i <= n; ++i) {
//            if (ch[L] == 0) {
//                ch[L] = 1;
//                p[L] = i;
//                DFS(L+1, sum + (p[L] * b[i]));
//                ch[L] = 0;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        DFS5 dfs5 = new DFS5();
//        Scanner kb = new Scanner(System.in);
//
//        n = kb.nextInt();
//        f = kb.nextInt();
//
//        // 컴비네이션값
//        b = new int[n];
//
//        // 순열
//        p = new int[n];
//
//        // 순열을 위한 체크 배열
//        ch = new int[n+1];
//
//        for (int i = 0; i < n; i++) {
//            b[i] = dfs5.combi(n-i, i);
//        }
//
//        dfs5.DFS(0,0);
//    }
//}
