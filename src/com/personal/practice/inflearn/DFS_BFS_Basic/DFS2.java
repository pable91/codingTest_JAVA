package com.personal.practice.inflearn.DFS_BFS_Basic;

// 부분집합 구하기(DFS)

import java.util.Scanner;

public class DFS2 {

    static int [] arr;
    static int num;

    public static void DFS(int L) {
        if (L == num + 1) {
            for (int i = 1; i <= num; ++i) {
                if (arr[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            return;
        }

        arr[L] = 1;
        DFS(L+1);
        arr[L] = 0;
        DFS(L+1);
    }

    public static void main(String[] args) {
        DFS2 obj = new DFS2();

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        arr = new int[num+1];
        obj.DFS(1);
    }
}



//public class DFS2 {
//
//    static int num = 3;
//    static int [] arr;
//    public void DFS(int n) {
//        if (n == num+1) {
//            String tmp = "";
//            for (int i = 1; i <= num; ++i) {
//                if(arr[i] == 1) {
//                    tmp += (i + " ");
//                }
//            }
//            if (tmp.length() > 0)
//                System.out.println(tmp);
//            return;
//        }
//
//        arr[n] = 1;
//        DFS(n+1);
//        arr[n] = 0;
//        DFS(n+1);
//    }
//
//    public static void main(String[] args) {
//        DFS2 obj = new DFS2();
//        arr = new int[num+1];
//        obj.DFS(1);
//    }
//}






