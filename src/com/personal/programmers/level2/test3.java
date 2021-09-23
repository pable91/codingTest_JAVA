package com.personal.programmers.level2;

/**
 *  DFS/BFS - 타겟 넘버
 */

class Solution_3 {
    int answer = 0;
    int length = 0;

    void func( int[] numbers, int idx, int sum , int target) {

        if ( idx == length) {
            if (sum == target)
                answer += 1;
            return;
        }

        func(numbers, idx + 1, sum + numbers[idx], target);
        func(numbers, idx + 1, sum - numbers[idx], target);

        return;
    }

    public int solution(int[] numbers, int target) {
        int sum = 0;
        int idx = 0;

        length = numbers.length;

        func(numbers, idx, sum, target);

        return answer;
    }
}

public class test3 {

    public static void main(String[] args) {
        Solution_3 solution_3 = new Solution_3();
        int[] arr = {1,1,1,1,1};
        int target = 3;
        solution_3.solution(arr, target);
    }
}
