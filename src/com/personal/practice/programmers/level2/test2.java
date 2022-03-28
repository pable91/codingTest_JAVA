package com.personal.practice.programmers.level2;

import java.util.Stack;

/**
 *  2017 팁스타운 - 짝지어 제거하기
 */

class Solution_2
{
    public int solution(String s)
    {
        int answer = -1;

        // 1. 문자열을 하나씩 순회하면서 스택에 넣는다.

        // 2. 넣을때 peek한 값이 현재 문자와 같으면 둘다 제거, 다르면 push

        // 3. 문자열을 끝까지 순회했을때 스택에 아무것도 안남아있으면 1 리턴, 남아있으면 0

        Stack<	Character> st = new Stack<>();
        for ( int i = 0; i < s.length(); ++i ) {
            if ( st.empty() ) {
                st.push(s.charAt(i));
            }
            else {
                char tmp = st.peek();
                if ( tmp == s.charAt(i) ) {
                    st.pop();
                }
                else {
                    st.push(s.charAt(i));
                }
            }
        }

        if ( st.empty() )
            return 1;
        else {
            return 0;
        }
    }
}

public class test2 {

    public static void main(String[] args) {
        Solution_2 solution = new Solution_2();
        solution.solution("baabaa");
    }
}
