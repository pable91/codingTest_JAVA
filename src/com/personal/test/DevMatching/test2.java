package com.personal.test.DevMatching;

import java.util.HashSet;

class Solution2 {

    public String func(String str) {
        String S = "";
        String N = "";
        // S 만 뽑기
        S = str.replaceAll("[0-9]","");
        // N 만 뽑기
        N = str.replaceAll("[^0-9]","");

        int n = 0;
        if (N.equals("") == false) {
            n = Integer.parseInt(N);
        }

        String result = S + Integer.toString(n + 1);
        return result;
    }

    public String solution(String[] registered_list, String new_id) {
        String answer = "";

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < registered_list.length; ++i) {
            set.add(registered_list[i]);
        }

        while (true) {
            if (set.contains(new_id)) {
                new_id = func(new_id);
            }
            else
                break;
        }

        // 1.new_id를 registered_list에서 있는지 확인
//        for (int i = 0; i < registered_list.length; ++i) {
//            // 1-2 있으면
//            if (registered_list[i].equals(new_id)) {
//                String str = registered_list[i];
//
//                new_id = func(str);
//                i = -1;
//            }
//        }


        // 1-1 없으면 바로 new_id를 추천하고 종료

        return answer = new_id;
    }

    public static void main(String[] args) {
        String[] str1 = new String[]{"bird99", "bird98", "bird101", "gotoxy"};
        String str2 = "bird98";
        Solution2 solution = new Solution2();
        solution.solution(str1, str2);
    }
}