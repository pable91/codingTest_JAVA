package com.personal.test.Storelink;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class test2 {

    Set<String> set = new TreeSet<>();

    public void func() {
        Queue<String> q = new LinkedList<>();
        q.offer("");

        while(!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; ++i) {
                String str = q.poll();
                String tmp1 = "4" + str;
                String tmp2 = "13" + str;

                if (set.size() > 5000) {
                    return;
                }

                set.add(tmp1);
                set.add(tmp2);
                q.offer(tmp1);
                q.offer(tmp2);
            }
        }
    }


    public long solution(int n) {
        long answer = 0;

        func();

//        for(BigInteger l : set) {
//            n--;
//            if (n == 0) {
//                answer = l.longValue();
//                break;
//            }
//        }

        return answer;
    }

    public static void main(String[] args) {
        test2 t = new test2();

        System.out.println(t.solution(2));


    }

}
