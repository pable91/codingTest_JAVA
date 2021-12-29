package com.personal.practice.inflearn.DFS_BFS_Advance;

// 최대 점수 구하기(DFS)

import java.util.ArrayList;
import java.util.Scanner;

class subject {
    public int score;
    public int time;

    public subject(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class DFS3 {

    static int m;
    static ArrayList<subject> arrayList = new ArrayList<subject>();

    public static int DFS(int idx, int sum, int time) {
        if (time > m)
            return sum - arrayList.get(idx-1).score;

        if (idx == arrayList.size())
            return sum;

        return Math.max(DFS(idx + 1, sum, time),
                DFS(idx + 1, sum + arrayList.get(idx).score, time + arrayList.get(idx).time));
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; ++i) {
            int score = in.nextInt();
            int time = in.nextInt();
            arrayList.add(new subject(score, time));
        }

        System.out.println(DFS(0, 0,0));
    }
}
