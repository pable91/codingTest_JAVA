package com.personal.practice.inflearn.DFS_BFS_Basic;

public class DFS1 {
    Node root;

    public void DFS(Node root) {
        if(root==null) return;

        System.out.print(root.data + " ");
        DFS(root.lt);
        DFS(root.rt);
    }

    public static void main(String[] args) {
        DFS1 t = new DFS1();
        t.root = new Node(1);
        t.root.lt = new Node(2);
        t.root.rt = new Node(3);
        t.root.lt.lt = new Node(4);
        t.root.lt.rt = new Node(5);
        t.root.rt.lt = new Node(6);
        t.root.rt.rt = new Node(7);

        t.DFS(t.root);
    }
}
