package com.personal.test.EbayKorea;

import java.util.Set;
import java.util.TreeSet;

public class test1 {

    String arr;

    TreeSet<String> answers = new TreeSet<String>();

    public void check (int[] stones, int k )
    {
        if (stones[stones.length-1] == k) {
            for (int i = 0; i < stones.length - 1; ++i) {
                if (stones[i] != 0) {
                    // 정답아님
                    return;
                }
            }

            // 정답임
//            String tmp = "";
//            for (int j = 0; j < arr.length(); ++j) {
//                tmp+= Integer.toString(arr[j]);
//            }
            answers.add(arr);
        }

        return;
    }

   public void DFS(int[] stones,int c, int k) {
        if (c > -1) {
            int j;
            for ( j = 0; j < stones.length; ++j) {
                if (j == c) {
                    stones[j] += 1;
                }
                else
                    stones[j] -= 1;
            }

            for ( j = 0; j < stones.length; ++j) {
                if (stones[j] == 0) {
                    check(stones, k);
                    return;
                }
            }
        }

        for (int i = 0; i < stones.length; ++i){
            //arr[i] += 1;
            arr += Integer.toString(i);
            DFS(stones, i, k);
            //arr[i] -= 1;
            arr = arr.substring(0, arr.length()-1);

            for ( int j = 0; j < stones.length; ++j) {
                if (j == i) {
                    stones[j] -= 1;
                }
                else
                    stones[j] += 1;
            }
        }
    }

    public String solution(int[] stones, int k) {
        String answer = "";

        arr = "";

        DFS(stones, -1, k);

        if (answers.size() == 0){
            return "-1";
        }

        return answer = answers.last();
    }

    public static void main(String[] args) {
        test1 test1 = new test1();

        int[] array = new int[] {1,3,2};
        String ttt = test1.solution(array, 3);

        System.out.println(ttt);
    }
}
