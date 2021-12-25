package com.personal.test.NaverFinancial;

import java.util.*;

public class test1 {

    public int solution(String[] id_list, int k) {
        int answer = 0;

        HashMap<String,Integer> hm = new HashMap<>();

        String[] arr = null;
        // 1. 리스트를 공백 제거해서 배열로 반환
        for (int i = 0; i < id_list.length; ++i) {
            arr = id_list[i].split(" ");

            //중복제거
            arr = new HashSet<String>(Arrays.asList(arr)).toArray(new String[0]);

            // 2. 배열을 읽으면서 해쉬맵에 생성 및 추가 ( 만약 k개 이상이면 넣지않기 )
            for (int j = 0; j < arr.length; ++j) {
                if (hm.containsKey(arr[j])) {
                    if (hm.get(arr[j]) < k) {
                        int n = hm.get(arr[j]);
                        n += 1;
                        hm.put(arr[j], n);
                        answer += 1;
                    }
                } else {
                    hm.put(arr[j], 1);
                    answer += 1;
                }
            }
        }

        // 3. 해쉬맵에 더할때 answer 값 증가
        return answer;
    }

    public static void main(String[] args) {
        test1 test = new test1();
        test.solution(new String[] {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"}, 3);
    }
}
