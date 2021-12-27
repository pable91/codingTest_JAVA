package com.personal.practice.inflearn.DFS_BFS_Basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기

public class BFS2{

    static int cnt = 0;
    public void BFS(int a, int target)
    {
        int [] check = new int[10001];
        Queue<Integer> q = new LinkedList<>();
        check[a] = 1;
        q.offer(a);

        while(!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; ++i) {
                int num = q.poll();
                if (num == target) {
                    return;
                }

                if (num + 1 < 10001 && check[num+1] == 0) {
                    check[num+1] = 1;
                    q.offer(num + 1);
                }
                if (num - 1 > -1 && check[num-1] == 0) {
                    check[num-1] = 1;
                    q.offer(num - 1);
                }
                if (num + 5 < 10001 && check[num+5] == 0) {
                    check[num+5] = 1;
                    q.offer(num + 5);
                }
            }
            cnt += 1;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();

        BFS2 bfs = new BFS2();
        bfs.BFS(input1, input2);
        System.out.println(cnt);
    }
}

//public class BFS2 {
//    static int n = 0;
//    static int [] check = new int[10001];
//    public void BFS(int cur, int ans) {
//        Queue<Integer> q = new LinkedList<>();
//        check[cur] = 1;
//        q.offer(cur);
//
//        while(!q.isEmpty()) {
//            int len = q.size();
//            int t;
//            for (int i = 0; i < len; ++i) {
//                t = q.poll();
//                if (t == ans)
//                    return;
//                if(t+1 < 10001 && check[t+1] == 0) {
//                    q.offer(t+1);
//                    check[t+1] = 1;
//                }
//                if(t-1 > -1 && check[t-1] == 0) {
//                    q.offer(t-1);
//                    check[t-1] = 1;
//                }
//                if(t+5 < 10001 && check[t+5] == 0) {
//                    q.offer(t+5);
//                    check[t+5] = 1;
//                }
//            }
//            n += 1;
//        }
//
//    }
//
//    public static void main(String[] args){
//        Scanner in=new Scanner(System.in);
//        int input1 = in.nextInt();
//        int input2 = in.nextInt();
//
//        BFS2 bfs = new BFS2();
//        bfs.BFS(input1,input2);
//        System.out.println(n);
//    }
//}









