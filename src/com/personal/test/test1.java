package com.personal.test;

import java.io.*;
import java.util.Locale;
import java.util.TreeSet;

class Tree{
    char data;
    Tree left, right;
    public Tree(char data) {
        this.data = data;
    }
}

class Solution {
    String answer = "";

    public String solution(String message) {
        int num = message.length() + 1;
        Tree nodes[] = new Tree[num];

        for ( int i = 1; i < num; ++i) {
            Tree node = new Tree(message.charAt(i-1));
            node.left = null;
            node.right = null;
            nodes[i] = node;
        }

        for ( int j = 2; j < num; ++j ) {
            if (j%2 == 0)
                nodes[j/2].left = nodes[j];
            else {
                nodes[j/2].right = nodes[j];
            }
        }

        postorder(nodes[1]);
        System.out.println("answer" + answer);

        return answer;
    }

    void postorder(Tree node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);

            answer += node.data;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("ABCDEF");
    }
}
