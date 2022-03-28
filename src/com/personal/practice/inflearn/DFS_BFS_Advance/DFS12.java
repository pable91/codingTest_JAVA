package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.Scanner;



public class DFS12 {

    static class OBJ {
        int score;
        int time;

        OBJ(int score, int time) {
            this.score = score;
            this.time = time;
        }
    }

    static int N;
    static int M;

    static OBJ [] arr;
    public static int DFS(int L, int sum, int time) {
        if (time > M) {
            return sum - arr[L-1].score;
        }

        if(L == N) {
            return sum;
        }

        return Math.max(DFS(L+1, sum + arr[L].score, time + arr[L].time), DFS(L+1, sum, time));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        arr = new OBJ[N];

        for (int i = 0; i < N; ++i) {
            int score = scanner.nextInt();
            int time = scanner.nextInt();
            arr[i] = new OBJ(score, time);

        }


        System.out.println(DFS(0, 0, 0));
    }
}
