package com.personal.practice.inflearn.DFS_BFS_Advance;

// 동전교환

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class DFS4 {
    static int m, n;
    static int [] counts;
    static Integer [] coins;

    static int answer = Integer.MAX_VALUE;
    public static void DFS(int L, int sum) {
        if(sum > m) {
            return;
        }

        if(L >= answer) {
            return;
        }

        if(sum == m) {
            answer = Math.min(answer, L);
            return;
        }

        for (int i = 0; i < n; ++i) {
            DFS(L+1, sum + coins[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        coins = new Integer[n];
        counts = new int[n];

        for (int i = 0; i < n; ++i) {
            coins[i] = in.nextInt();
        }

        m = in.nextInt();

        Arrays.sort(coins, Collections.reverseOrder());

        DFS(0, 0);

        System.out.println(answer);
    }
}














//public class DFS4 {
//
//    static int[] counts;
//    static int c;
//    static Integer [] coins;
//    static int m, n;
//    static int answer = 500;
//    public void DFS(int sum, int c) {
//        if (sum > m)
//            return;
//
//        if (c >= answer)
//            return;
//
//        if (sum == m) {
//            answer = Math.min(answer,c);
//            return;
//        }
//
//        for (int i = 0; i < n; ++i) {
//            DFS(sum + coins[i] , c + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        counts = new int[n];
//        coins = new Integer[n];
//
//        for ( int i = 0; i < n; ++i) {
//            coins[i] = in.nextInt();
//        }
//
//        Arrays.sort(coins, Collections.reverseOrder()) ;
//        m = in.nextInt();
//
//        DFS4 dfs4 = new DFS4();
//        dfs4.DFS(0, 0);
//
//        System.out.println(answer);
//    }
//}
