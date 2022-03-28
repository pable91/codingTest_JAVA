package com.personal.practice.inflearn.DFS_BFS_Advance;

import java.util.Scanner;

// 합이 같은 부분집합(DFS : 아마존 인터뷰)

public class DFS1 {
    static int N;
    static int [] arr;
    static String result = "NO";
    static boolean flag = false;
    static int total;
    public static void DFS(int L, int sum) {
        if (result.equals("YES"))
            return;

        if(L == N) {
            if(total - sum == sum) {
                result = "YES";
            }
            return;
        }

        DFS(L+1, sum + arr[L]);
        DFS(L+1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; ++i) {
            int num = sc.nextInt();
            arr[i] = num;
            total += num;
        }

        DFS(0,0);
        System.out.println(result);
    }
}








//public class DFS1 {
//
//    static int total = 0;
//    static int n = 0;
//    static String answer = "NO";
//    static int [] arr;
//    public void DFS(int idx, int sum) {
//        if(answer.equals("YES")) {
//            return;
//        }
//
//        if(idx == n) {
//            if ((total - sum)== sum) {
//                answer = "YES";
//            }
//            return;
//        }
//
//        DFS(idx+1, sum + arr[idx]);
//        DFS(idx+1, sum);
//    }
//
//    public static void main(String[] args){
//        DFS1 dfs = new DFS1();
//        Scanner in=new Scanner(System.in);
//        n = in.nextInt();
//
//        arr = new int[n];
//        for (int i = 0; i < n; ++i) {
//            arr[i] = in.nextInt();
//            total += arr[i];
//        }
//
//        dfs.DFS(0,0);
//        System.out.println(answer);
//    }
//
//}
