package com.personal.practice.inflearn;

// Tree 말단 노드까지의 가장 짧은 경로(DFS로 풀어보기)

public class DFS3 {
    Node root;
    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null)
            return L;

        return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
    }

    public static void main(String[] args) {
        DFS3 t = new DFS3();
        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);
        System.out.println(t.DFS(0, t.root));
    }
}
