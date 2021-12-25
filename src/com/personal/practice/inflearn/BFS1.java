package com.personal.practice.inflearn;

import java.util.LinkedList;
import java.util.Queue;



public class BFS1 {
    Node root;

    public void BFS(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; ++i) {
                Node cur = queue.poll();
                System.out.println("cur" + cur.data);
                if (cur.lt != null) queue.offer(cur.lt);
                if (cur.rt != null) queue.offer(cur.rt);
            }
        }

    }

    public static void main(String[] args) {
        BFS1 main = new BFS1();
        main.root = new Node(1);
        main.root.lt = new Node(2);
        main.root.rt = new Node(3);
        main.root.lt.lt = new Node(4);
        main.root.lt.rt = new Node(5);
        main.root.rt.lt = new Node(6);
        main.root.rt.rt = new Node(7);
        main.BFS(main.root);
    }
}
