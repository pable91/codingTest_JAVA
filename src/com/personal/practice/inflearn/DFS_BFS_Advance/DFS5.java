package com.personal.practice.inflearn.DFS_BFS_Advance;

// 순열 구하기

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS5 {

    static int n;
    static int m;
    static int[] arr, ch, answer;

    public void DFS(int idx) {
        if (idx == m) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[j] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = 0; i < n; ++i) {
            if (ch[i] == 0) {
                ch[i] = 1;
                answer[idx] = arr[i];
                DFS(idx + 1);
                ch[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[n];
        ch = new int[n];
        answer = new int[m];

        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }

        DFS5 dfs5 = new DFS5();
        dfs5.DFS(0);
    }
}
