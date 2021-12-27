package com.personal.practice.inflearn.DFS_BFS_Basic;

// Tree 말단 노드까지의 가장 짧은 경로(BFS로 풀어보기)

import java.util.LinkedList;
import java.util.Queue;

public class BFS3 {
    Node root;
    static int n = 0;
    public void BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                Node node = q.poll();
                if (node.lt == null && node.rt == null) {
                    return;
                }

                q.offer(node.lt);
                q.offer(node.rt);
            }
            n += 1;
        }
    }

    public static void main(String[] args) {
        BFS3 t = new BFS3();
        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);
        t.BFS(t.root);
        System.out.println(n);
    }
}
