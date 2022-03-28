package com.personal.test.Trenbi;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

class Solution{
//    public String solution(String s){
//        String answer = "";
//        String word = s.toLowerCase();
//
//        int [] arr = new int[26];
//        int num = Integer.MIN_VALUE;
//        int i;
//        for (i = 0; i < word.length(); ++i) {
//            arr[word.charAt(i) - 97] += 1;
//            num = Integer.max(num, arr[word.charAt(i) - 97]);
//        }
//
//        for (i = 0; i < arr.length; ++i) {
//            if ( num == arr[i] ) {
//                answer += (char)(i + 97);
//            }
//        }
//
//
//        return answer;
//    }
//
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.solution("BbA"));
//    }


//    public int solution(String s) {
//        int[] check = new int[26];
//        TreeSet<String> set = new TreeSet<>();
//
//        int len = s.length();
//        String str = "";
//        boolean flag = true;
//        for (int i = 1; i <= len; ++i) {
//            for (int j = 0; j < len; ++j) {
//                if (j+i <= len) {
//                    str = s.substring(j, j + i);
//                    for (char c : str.toCharArray()) {
//                        if (check[c-97] == 0)
//                            check[c-97] = 1;
//                        else if (check[c-97] == 1) {
//                            flag = false;
//                            break;
//                        }
//                    }
//
//                    if (flag) {
//                        set.add(str);
//                    }
//
//                    Arrays.fill(check, 0);
//                    flag = true;
//                }
//            }
//        }
//
//        return set.size();
//    }


    public int[] solution(int[] grade) {
        int[] tmp = grade;

        grade = Arrays.stream(grade).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < tmp.length; ++i) {

        }

        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {3,2,1,2};
        System.out.println(solution.solution(arr));
    }
}

