package com.personal.test.Storelink;

import java.util.Arrays;

public class test1 {

    public int solution(int[] bombs) {
        int answer = 0;

        Arrays.sort(bombs);

        for (int i = 0; i < bombs.length; ++i) {
            if (bombs[i] > i)
                answer += 1;
            else {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        test1 t = new test1();
        int [] arr = {2,2,2,2};
        System.out.println(t.solution(arr));
    }
}
