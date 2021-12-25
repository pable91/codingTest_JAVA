package com.personal.test.DeliveryHero;

import java.util.ArrayList;
import java.util.List;


class Solution3 {
    static ArrayList<Integer> adj[];
    static boolean visited[];
    static boolean finished[];

    static boolean isCycle = false;

    public boolean solution(int[] A, int[] B) {
        adj = new ArrayList[A.length + 1];

        int i;
        for (i = 1; i <= A.length; ++i) {
            adj[i] = new ArrayList<>();
        }

        for (i = 0; i < A.length; ++i) {
            adj[A[i]].add(B[i]);
        }
        visited = new boolean[A.length + 1];
        finished = new boolean[A.length + 1];

        DFS(1);

        boolean isAllVisit = true;
        for (i = 1; i <= A.length; ++i) {
            if ( visited[i] == false) {
                isAllVisit = false;
            }
        }
        return isCycle && isAllVisit;
    }

    public static void DFS(int cur) {
        visited[cur] = true;
        for (int next : adj[cur]) {
            if (!visited[next]) {
                DFS(next);
            }
            else if (finished[next] == false) {
                isCycle = true;
            }
        }

        finished[cur] = true;
    }

    public static void main(String[] args) {

        Solution3 solution = new Solution3();
        int[] a = {1,2,1};
        int[] b = {2,3,3};
        System.out.println("answer => " + solution.solution(a,b));
    }
}
