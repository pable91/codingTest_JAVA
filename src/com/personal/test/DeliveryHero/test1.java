package com.personal.test.DeliveryHero;


import java.util.ArrayList;
import java.util.Stack;

class Solution1 {
    public int solution(String S) {
        // write your code in Java SE 8

        // 1. 문자열 S 공백제거하고 배열에 요소 넣기
        String[] array = S.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String str : array) {
            if (str.equals("DUP")) {
                if (stack.isEmpty())
                    return -1;
                int tmp = stack.peek();
                stack.push(tmp);
            }
            else if (str.equals("POP")) {
                if (stack.isEmpty())
                    return -1;
                stack.pop();
            }
            else if (str.equals("-")) {
                if (stack.size() < 2)
                    return -1;
                int a = stack.pop();
                int b = stack.pop();
                if ( a < b )
                    return -1;
                stack.push(a-b);
            }
            else if (str.equals("+")) {
                if (stack.size() < 2)
                    return -1;
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a+b);
            }
            else {
                stack.push(Integer.parseInt(str));
            }
        }

        if (stack.isEmpty())
            return -1;
        return stack.peek();
    }

    public static void main(String[] args) {

        Solution1 solution = new Solution1();
        solution.solution("3 DUP 5 - -");
    }
}
