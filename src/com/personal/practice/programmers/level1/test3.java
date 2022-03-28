package com.personal.practice.programmers.level1;

/**
 *  위클리챌린지 - 최소직사각형
 */

class Solution_3 {
    public int solution(int[][] sizes) {
        int small = 0;
        int large = 0;

        for(int[] card : sizes){
            int a = Math.max(card[0], card[1]);
            int b = Math.min(card[0], card[1]);

            small = Math.max(small, a);
            large = Math.max(large, b);
        }

        return small * large;
    }
}

public class test3 {
    public static void main(String[] args) {
//        Solution_3 solution = new Solution_3();
//        solution.solution();
    }
}
