package com.personal.practice.programmers.level1;

import java.util.*;

/**
 *  위클리챌린지 - 직업군 추천하기
 */

public class test1 {

    static class Solution {
        public String solution(String[] table, String[] languages, int[] preference) {
            String answer = "";

            String [] arr = new String[5];
            Map<String, Integer> map = new HashMap<>();
            TreeSet<String> set = new TreeSet<>();

            for ( int i = 0; i < table.length; ++i ) {
                int sum = 0;
                // 1. table 한 요소를 split해서 배열로 만들기
                arr = table[i].split(" ");

                // 2. languages를 순회
                for ( int j = 0; j < languages.length; ++j ) {
                    String lang = languages[j];
                    for ( int k = 1; k <= 5; ++k ) {
                        if (arr[k].equals(lang)) {
                            int point = 6 - k;
                            // 직업군 언어 점수 곱하기와 언어 선호도 곱하기 그리고 sum에 더하기
                            sum += point * preference[j];
                        }
                    }
                }
                // 총합(sum)을 map에 넣어줌
                map.put(arr[0], sum);
            }


            int maxValue = Collections.max(map.values());

            for ( String str : map.keySet()) {
                if ( map.get(str).equals(maxValue) ) {
                    set.add(str);
                }
            }
            return set.first();
        }
    }

    public static void main(String[] args) {
        String[] str1 = {"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"};
        String[] str2 = {"PYTHON", "C++", "SQL"};
        int[] arr3 = {7,5,5};
        Solution solution = new Solution();
        String result = solution.solution(str1, str2, arr3);
        System.out.println(">>" + result);

    }
}
