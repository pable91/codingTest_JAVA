package com.personal.practice.inflearn.DFS_BFS_Advance;

// 조합의 경우수(메모이제이션)

import java.util.Scanner;

public class DFS11 {

    static int n;
    static int r;
    static int [][] arr;

    int DFS(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        }

        if(arr[n][r] != 0) {
            return arr[n][r];
        }

        return arr[n][r] = DFS(n-1,r-1) + DFS(n-1,r);
    }

    public static void main(String[] args) {
        DFS11 dfs11 = new DFS11();
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        r = scanner.nextInt();

        arr = new int[n+1][n+1];
        System.out.println(dfs11.DFS(n,r));
    }
}
