package com.personal.programmers.level2;

/**
 *  위클리챌린지 - 모음사전
 */

class Solution {
    int answer = 0;

    public boolean func(String src, String target){
        if (src.equals(target))
            return true;

        if (src.length() > 4)
            return false;

        answer += 1;
        if (func(src + 'A', target))
            return true;

        answer += 1;
        if (func(src + 'E', target))
            return true;

        answer += 1;
        if (func(src + 'I', target))
            return true;

        answer += 1;
        if (func(src + 'O', target))
            return true;

        answer += 1;
        if (func(src + 'U', target))
            return true;

        return false;
    }
    public int solution(String word) {
        func("", word);

        return answer;
    }
}

public class test1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution("AAAAE");
    }
}
